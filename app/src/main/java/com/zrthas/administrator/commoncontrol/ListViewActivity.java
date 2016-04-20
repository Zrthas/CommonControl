package com.zrthas.administrator.commoncontrol;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zrthas.administrator.commoncontrol.Phone.GetNumber;
import com.zrthas.administrator.commoncontrol.Phone.PhoneAdapter;


/**
 * Created by Administrator on 2016/4/19.
 */
public class ListViewActivity extends Activity {

    private ListView listView;
    private PhoneAdapter phoneAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        GetNumber.getNumber(this);
        listView =(ListView)findViewById(R.id.phoneListView);
        phoneAdapter = new PhoneAdapter(GetNumber.phoneBeanLists,this);
        listView.setAdapter(phoneAdapter);
    }

}
