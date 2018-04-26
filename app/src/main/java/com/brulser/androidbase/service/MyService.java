package com.brulser.androidbase.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.orhanobut.logger.Logger;


/**
 * Created by Brulser on 2018/4/26.
 * Email:565881738@qq.com wellcome For Your Letters
 * Tel： 13638667479
 * Company：TuanLi51
 * Alias： Brulser
 * Name：Shun Yao
 * 中文名：姚舜
 * Label：Focus, Seriousness, Efficiency, Results.
 */

public class MyService extends Service {
    public static final String Tag = MyService.class.getSimpleName();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        Logger.d(" .MyService oncreate");

        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Logger.d(" .MyService onDestroy");

        super.onDestroy();
    }
}
