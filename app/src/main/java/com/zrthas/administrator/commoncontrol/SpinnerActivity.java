package com.zrthas.administrator.commoncontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner sinner;
    private String[] dataSource = new String[]{"Demo1","Demo2","Demo3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sinner = (Spinner) findViewById(R.id.spinner);

        sinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dataSource));

        //监听
        sinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("用户选择的是"+dataSource[position]);
            }
        });
    }
}
