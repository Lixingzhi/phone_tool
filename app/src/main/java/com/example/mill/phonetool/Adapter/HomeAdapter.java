package com.example.mill.phonetool.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mill.phonetool.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Mill_li on 2017/3/19.
 */

public class HomeAdapter extends BaseAdapter {

    private ArrayList<String> data;
    private Context context;

    public HomeAdapter(ArrayList<String> info, Context context) {
        this.data = info;
        this.context = context;
    }

    @Override
    public int getCount() {
        /* 返回0则不会执行getView函数 */
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lv_home, null);
        }

        TextView info = (TextView) convertView.findViewById(R.id.info);
        info.setText(data.get(position));

        return convertView;
    }
}
