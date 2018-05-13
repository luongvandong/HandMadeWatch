package com.example.windows10timt.handmadewatch;

import android.app.Application;

/**
 * Created by Windows 10 TIMT on 3/7/2018.
 */

public class WatchApplication extends Application {
    private static WatchApplication watchApplication;

    public static WatchApplication getInstance() {
        return watchApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        watchApplication = this;
    }
}
