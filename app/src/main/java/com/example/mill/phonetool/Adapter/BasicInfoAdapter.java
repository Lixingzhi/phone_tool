package com.example.mill.phonetool.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.mill.phonetool.R;

/**
 * Created by Mill_li on 2017/3/23.
 */

public class BasicInfoAdapter extends BaseAdapter {

    private static final String TAG = "BasicInfoAdapter";

    private Context context;

    public BasicInfoAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_basicinfo, null);
        }

        return convertView;
    }
}
