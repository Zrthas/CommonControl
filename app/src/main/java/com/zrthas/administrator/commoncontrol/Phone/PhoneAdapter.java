package com.zrthas.administrator.commoncontrol.Phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zrthas.administrator.commoncontrol.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2016/4/20.
 */
public class PhoneAdapter extends BaseAdapter {
    private List<PhoneBean> phoneBeanLists;
    private Context context;
    private LinearLayout linearLayout;
    public PhoneAdapter(List<PhoneBean> phoneBeanLists,Context context) {
        this.phoneBeanLists = phoneBeanLists;
        this.context = context;
    }

    @Override
    public int getCount() {
        //返回集合的数量
        return phoneBeanLists.size();
    }

    @Override
    public Object getItem(int position) {
        //获取当条数据
        return phoneBeanLists.get(position);
        //return null;
    }

    @Override
    public long getItemId(int position) {
        //获取当前ID
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //必需要加载View,而这个View就是要将数据加载到的视图。
        //需求创建电话内容每一条显示的格式
        //获取加载View权限
        //必需要加载View,而这个View就是要将数据加载到的视图。
        //需求创建电话内容每一条显示的格式
        //获取加载View权限
        /*LayoutInflater inflater = LayoutInflater.from(context);
        linearLayout =(LinearLayout)inflater.inflate(R.layout.callstyle,null);
        TextView phoneNameTv = (TextView)linearLayout.findViewById(R.id.phoneName);
        TextView phoneNumberTv = (TextView)linearLayout.findViewById(R.id.phoneNumber);
        phoneNameTv.setText(phoneBeanLists.get(position).getPhoneName());
        phoneNumberTv.setText(phoneBeanLists.get(position).getPhoneNumber());*/
        ViewHolder holder;
        if (convertView ==null){
            //并没有加载View
            convertView = LayoutInflater.from(context).inflate(R.layout.callstyle,null);
            holder = new ViewHolder();
            holder.nameTv = (TextView) convertView.findViewById(R.id.phoneName);
            holder.numberTv = (TextView) convertView.findViewById(R.id.phoneNumber);

            holder.nameTv.setText(phoneBeanLists.get(position).getPhoneName());
            holder.numberTv.setText(phoneBeanLists.get(position).getPhoneNumber());

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
            holder.nameTv.setText(phoneBeanLists.get(position).getPhoneName());
            holder.numberTv.setText(phoneBeanLists.get(position).getPhoneNumber());
        }
        return convertView;
    }
    private static class ViewHolder{
        TextView nameTv;
        TextView numberTv;
    }
}
