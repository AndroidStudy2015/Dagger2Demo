package com.dagger2.www.dagger2demo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.dagger2.www.dagger2demo.R;
import com.dagger2.www.dagger2demo.app.MyApp;
import com.dagger2.www.dagger2demo.di.component.AppComponent;
import com.dagger2.www.dagger2demo.di.component.DaggerPersonComponent;
import com.dagger2.www.dagger2demo.di.module.PersonModule;
import com.dagger2.www.dagger2demo.other.Person;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Person person;

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityComponent build = DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build();
//        build.inject(this);

        DaggerPersonComponent.builder()
                .appComponent(getAppComponent())
//                .appModule(new AppModule(getAppComponent().getAppContext()))
                .personModule(new PersonModule())
                .build()
                .inject(this);


        Log.e("CCC", person.toString() + "========="+context);
    }


    public AppComponent getAppComponent() {
        return ((MyApp) getApplication()).getAppComponent();
    }

}
