package com.ocypode.sample;

import android.app.Application;

import roboguice.RoboGuice;

/**
 * Created by macksuelsantos on 3/28/17.
 */

public class MainApplication extends Application {

    static {
        RoboGuice.setUseAnnotationDatabases(false);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
