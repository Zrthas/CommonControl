package com.zrthas.administrator.commoncontrol;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by Administrator on 2016/4/19.
 */
public class GridViewActivity extends Activity {
    private GridView gridView;
    private ArrayAdapter<String> adapter;
     @Override
    protected void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.gridview);

         //配置数据
         adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
         gridView = (GridView) findViewById(R.id.gridView);

         gridView.setAdapter(adapter);
         //填充数据
         for (int i =0;i<80;i++){
             adapter.add("zrthas"+i);
         }
     }
}
