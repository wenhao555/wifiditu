package com.example.wifiposition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.autonavi.indoor.constant.Configuration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Configuration.Builder mConfigBuilder= new Configuration.Builder(this);
        mConfigBuilder.setLBSParam("69c6c285407c34fb36c3b156d314f7ea");
    }
}
