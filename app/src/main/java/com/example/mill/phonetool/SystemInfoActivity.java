package com.example.mill.phonetool;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mill.phonetool.Adapter.TitleAdapter;

/**
 * Created by Mill_li on 2017/3/19.
 */

public class SystemInfoActivity extends Activity {

    private static final String TAG = "SystemInfoActivity";

    private ListView listView;
    private TitleAdapter infoadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systeminfo);

        initdata();
    }

    private void initdata() {
        infoadapter = new TitleAdapter(this.getBaseContext(), this);

        listView = (ListView) findViewById(R.id.lv_title);
        listView.setAdapter(infoadapter);
    }
}
