package com.example.mill.phonetool.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mill.phonetool.R;

/**
 * Created by Mill_li on 2017/3/19.
 */

public class TitleAdapter extends BaseAdapter {

    private static final String TAG = "TitleAdapter";

    private Context context;
    private TextView tv_title;

    public TitleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 11;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.basicinfo, null);
            //tv_title = (TextView) convertView.findViewById(R.id.tv_title);
        }

        Log.i(TAG, "position = " + position);
        switch (position) {
            case 0: {
                //tv_title.setText("基本信息");
                convertView = LayoutInflater.from(context).inflate(R.layout.basicinfo, null);

                /*
                ListAdapter listAdapter = listView.getAdapter();
                if(listAdapter == null) {
                    break;
                }
                int totalHeight = 0;
                for(int i = 0, len = listAdapter.getCount(); i < len; i++) { // listAdapter.getCount()返回数据项的数目
                    View listItem = listAdapter.getView(i, null, listView);
                    listItem.measure(0, 0); // 计算子项View 的宽高
                    totalHeight += listItem.getMeasuredHeight(); // 统计所有子项的总高度
                }
                ViewGroup.LayoutParams params = listView.getLayoutParams();
                params.height = totalHeight
                        + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
                // listView.getDividerHeight()获取子项间分隔符占用的高度
                // params.height最后得到整个ListView完整显示需要的高度
                listView.setLayoutParams(params);
                */
                break;
            }

            case 1: {
                //tv_title.setText("存储(可用/总量)");
                convertView = LayoutInflater.from(context).inflate(R.layout.memory, null);
                break;
            }

            case 2: {
                //tv_title.setText("CPU");
                convertView = LayoutInflater.from(context).inflate(R.layout.cpu, null);
                break;
            }

            case 3: {
                //tv_title.setText("显示");
                convertView = LayoutInflater.from(context).inflate(R.layout.display, null);
                break;
            }

            case 4: {
                //tv_title.setText("相机");
                convertView = LayoutInflater.from(context).inflate(R.layout.camera, null);
                break;
            }

            case 5: {
                //tv_title.setText("电池");
                convertView = LayoutInflater.from(context).inflate(R.layout.battery, null);
                break;
            }

            case 6: {
                //tv_title.setText("外观");
                convertView = LayoutInflater.from(context).inflate(R.layout.surface, null);
                break;
            }

            case 7: {
                //tv_title.setText("OS");
                convertView = LayoutInflater.from(context).inflate(R.layout.os, null);
                break;
            }

            case 8: {
                //tv_title.setText("传输");
                convertView = LayoutInflater.from(context).inflate(R.layout.transmission, null);
                break;
            }

            case 9: {
                //tv_title.setText("网络");
                convertView = LayoutInflater.from(context).inflate(R.layout.network, null);
                break;
            }

            case 10: {
                //tv_title.setText("传感器");
                convertView = LayoutInflater.from(context).inflate(R.layout.sensor, null);
                break;
            }

            default:
                break;

        }

        return convertView;
    }
}
