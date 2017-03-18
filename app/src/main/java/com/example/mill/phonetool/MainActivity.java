package com.example.mill.phonetool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mill.phonetool.Adapter.HomeAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private static final String INFO = "系统信息";
    private static final String FUNC = "功能检测";

    private ArrayList<String> listitems;

    private ListView listView;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        homeAdapter = new HomeAdapter(listitems, this);
        listView = (ListView) findViewById(R.id.lv_home);
        listView.setAdapter(homeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {//"系统信息"
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, SystemInfoActivity.class);
                        startActivity(intent);
                    }
                    break;

                    case 1: {//"功能检测"
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, FunctionTest.class);
                        startActivity(intent);
                    }
                    break;

                    default:
                        break;
                }
            }
        });
    }

    private void initData() {
        listitems = new ArrayList<String>();

        listitems.add(INFO);
        listitems.add(FUNC);
    }
}
