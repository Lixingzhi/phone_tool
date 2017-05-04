package com.example.mill.phonetool.Adapter;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mill.phonetool.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Mill_li on 2017/3/19.
 */

public class TitleAdapter extends BaseAdapter {

    private static final String TAG = "TitleAdapter";

    private Context context;
    private Activity activity;
    private TextView textView;

    public TitleAdapter(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
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

                textView = (TextView) convertView.findViewById(R.id.tv_brand);
                textView.setText(android.os.Build.BRAND);

                textView = (TextView) convertView.findViewById(R.id.tv_model);
                textView.setText(Build.MODEL);

                textView = (TextView) convertView.findViewById(R.id.tv_cpumodel);
                textView.setText(getCpuInfo()[1]);

                WindowManager windowManager = activity.getWindowManager();
                Display display = windowManager.getDefaultDisplay();
                int screenWidth = screenWidth = display.getWidth();
                int screenHeight = screenHeight = display.getHeight();
                textView = (TextView) convertView.findViewById(R.id.tv_resolution_ratio);
                textView.setText(screenHeight + "*" + screenWidth);
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

    public void handleMessage(Notification.MessagingStyle.Message msg) {

    }

    public String[] getCpuInfo() {
        String str1 = "/proc/cpuinfo";
        String str2="";
        String[] cpuInfo={"",""};
        String[] arrayOfString;
        try {
            FileReader fr = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(fr, 8192);
            str2 = localBufferedReader.readLine();
            arrayOfString = str2.split("\\s+");
            for (int i = 2; i < arrayOfString.length; i++) {
                cpuInfo[0] = cpuInfo[0] + arrayOfString[i] + " ";
            }
            str2 = localBufferedReader.readLine();
            arrayOfString = str2.split("\\s+");
            //arrayOfString = str2.split("\\t");
            cpuInfo[1] += arrayOfString[3];
            localBufferedReader.close();
        } catch (IOException e) {
        }
        return cpuInfo;
    }
}
