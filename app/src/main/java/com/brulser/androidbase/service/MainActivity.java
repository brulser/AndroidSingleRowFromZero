package com.brulser.androidbase.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.brulser.androidbase.LogUtils;
import com.brulser.androidbase.R;

public class MainActivity extends AppCompatActivity {
    Intent intent_start;
    Intent intent_bind;
    MyServiceConnection connection = new MyServiceConnection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        intent_start = new Intent(this, MyService.class);
        startService(intent_start);
        LogUtils.d("startService ");
    }

    public void bindService(View view) {
        intent_bind = new Intent(this, MyService.class);
        bindService(intent_bind, connection, BIND_AUTO_CREATE);
    }

    public void stopService(View view) {
        stopService(intent_start);
    }

    public void stopbindService(View view) {
        unbindService(connection);
    }

    class MyServiceConnection implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService service = ((MyService.Mybind) iBinder).getService();
            LogUtils.d("MyServiceConnection onServiceConnected 绑定service成功 ");
            service.OnSericeSysout("已经连接上绑定上service");
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtils.d("MyServiceConnection onServiceDisconnected service 解绑");
        }
    }
}
