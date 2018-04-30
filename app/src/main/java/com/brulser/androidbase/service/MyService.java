package com.brulser.androidbase.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.brulser.androidbase.LogUtils;


/**
 * Created by Brulser on 2018/4/26.
 * Email: yao5460android@163.com wellcome For Your Letters
 * Company：TuanLi51
 * Alias： Brulser
 * Name：Shun Yao
 * 中文名：姚舜
 * Label：Focus, Seriousness, Efficiency, Results.
 */

public class MyService extends Service {
    public static final String Tag = MyService.class.getSimpleName();
    Mybind mybind = new Mybind();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        LogUtils.d(Tag + " Onbind ");
        return mybind;
    }

    class Mybind extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogUtils.d(Tag + " onUnbind ");
        return super.onUnbind(intent);
    }

    public void OnSericeSysout(String msg) {
        LogUtils.d("OnSericeSysout " + msg);
    }


    @Override
    public void onCreate() {
        LogUtils.d(Tag + "  oncreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        LogUtils.d(Tag + "  onstart");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        LogUtils.d(Tag + "  onDestroy");
        super.onDestroy();
    }
}
