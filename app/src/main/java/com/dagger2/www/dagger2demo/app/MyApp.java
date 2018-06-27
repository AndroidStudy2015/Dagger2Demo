package com.dagger2.www.dagger2demo.app;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.dagger2.www.dagger2demo.di.component.AppComponent;
import com.dagger2.www.dagger2demo.di.component.DaggerAppComponent;
import com.dagger2.www.dagger2demo.di.module.AppModule;

import javax.inject.Inject;

public class MyApp extends Application {
    @Inject
    Context context;

   public static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        mAppComponent.inject(this);

        Log.e("ccc",context+"  app");
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
