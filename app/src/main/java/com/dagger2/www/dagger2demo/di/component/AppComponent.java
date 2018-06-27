package com.dagger2.www.dagger2demo.di.component;


import android.content.Context;

import com.dagger2.www.dagger2demo.app.MyApp;
import com.dagger2.www.dagger2demo.di.module.AppModule;

import javax.inject.Singleton;

        import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context getAppContext();

    void inject(MyApp app);
}
