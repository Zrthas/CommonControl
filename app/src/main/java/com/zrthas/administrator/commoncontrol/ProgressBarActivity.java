package com.zrthas.administrator.commoncontrol;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/4/19.
 */
public class ProgressBarActivity extends Activity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);

        progressBar = (ProgressBar) findViewById(R.id.loadingBar);
        //progressBar.setMax(100);
        //progressBar.setProgress(50);
        startTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        startTimer();

    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTime();
    }

    private int progress =0;

    /**
     * 进度条启动
     */
    public void startTimer(){
        if (timer == null){
            timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                progress++;
                progressBar.setProgress(progress);
            }};

        timer.schedule(timerTask,200,200);
        }
    }

    /**
     * 进度条停止
     */
    public void stopTime(){
        if (timer!=null){
            timer.cancel();
            timerTask.cancel();

            timer = null;
            timerTask = null;
        }
    }

    private Timer timer =null;
    private TimerTask timerTask = null;
}
