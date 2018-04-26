package com.brulser.androidbase.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.brulser.androidbase.R;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent intent_start = new Intent(this, MyService.class);
        startService(intent_start);
        Logger.d("startService ");
    }

    public void bindService(View view) {
        Intent intent_bind = new Intent(this, MyService.class);
        bindService(intent_bind, new MyServiceConnection(), BIND_AUTO_CREATE);
    }

    class MyServiceConnection implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    }
}
