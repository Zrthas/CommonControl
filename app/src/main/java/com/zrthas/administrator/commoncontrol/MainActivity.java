package com.zrthas.administrator.commoncontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    /*
    定义数组来表示listView要显示，也是我们学习哪些常用的控件
     */
    private static final String[] commonFunList = new String[]{

            "ListView控件演示",
            "ProgressBar控件演示",
            "GridView控件演示",
            "ScrollView控件演示",
            "DatePicker控件演示"
    };

    //定义listView
    private ListView listView ;
    /*
    ** 根据Item的position位置来判断具体跳转至哪个Activity
     */
    private void toNewActivity(int position){
        Intent i;
        switch (position){
            case 0:
                i = new Intent(MainActivity.this,ListViewActivity.class);
                break;
            case 1:
                i = new Intent(MainActivity.this,ProgressBarActivity.class);
                break;
            case 2:
                i = new Intent(MainActivity.this,GridViewActivity.class);
                break;
            case 3:
                i = new Intent(MainActivity.this,ScrollViewActivity.class);
                break;
            case 4:
                i = new Intent(MainActivity.this,DatePickerActivity.class);
                break;
            default:
                i = new Intent(MainActivity.this,MainActivity.class);
                break;
        }
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView_fun);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                commonFunList));
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        toNewActivity(position);
                    }
                }
        );
    }
}
