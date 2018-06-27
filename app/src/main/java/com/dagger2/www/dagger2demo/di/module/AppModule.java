package com.dagger2.www.dagger2demo.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {


    Context context;

    public AppModule(Context context) {
        this.context = context;
    }
@Singleton
    @Provides
    public Context provideContext() {
        return context;
    }
}
