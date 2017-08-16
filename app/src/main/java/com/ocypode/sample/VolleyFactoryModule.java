package com.ocypode.sample;

import android.app.Application;
import android.content.Context;

import com.google.inject.AbstractModule;

public class VolleyFactoryModule extends AbstractModule {

    private final Context mContext;

    public VolleyFactoryModule(Application application) {
        this.mContext = application.getApplicationContext();
    }

    @Override
    public void configure() {
//        bind(FeedService.class).toInstance(new FeedVolleyRestClient(mContext));
    }

}
