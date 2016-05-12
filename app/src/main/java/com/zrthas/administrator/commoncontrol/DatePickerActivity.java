package com.zrthas.administrator.commoncontrol;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by Administrator on 2016/4/19.
 */
public class DatePickerActivity extends Activity {
    private Button btnChooseDate;
    private Button btnChooseTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker);
        btnChooseDate = (Button) findViewById(R.id.btnChooseDate);
        btnChooseTime = (Button) findViewById(R.id.btnChooseTime);

        btnChooseDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(DatePickerActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        btnChooseDate.setText(String.format("%d-%d-%d",year,monthOfYear+1,dayOfMonth));
                    }
                },2016,5,12).show();
            }
        });

        btnChooseTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(DatePickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        //btnChooseTime.setText(String.format("%d:%d",hourOfDay,minute));
                        btnChooseTime.setText(String.format("%s:%s",timeFormat(hourOfDay),timeFormat(minute)));
                    }
                },0,0,true).show();
            }
        });


    }

    public String timeFormat(int time){
        return time>10?""+time:"0"+time;
    }
}
