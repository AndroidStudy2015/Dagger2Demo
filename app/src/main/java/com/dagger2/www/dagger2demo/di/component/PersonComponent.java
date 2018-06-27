package com.dagger2.www.dagger2demo.di.component;


import com.dagger2.www.dagger2demo.activity.MainActivity;
import com.dagger2.www.dagger2demo.di.module.PersonModule;
import com.dagger2.www.dagger2demo.di.scope.ActivityScope;
import com.dagger2.www.dagger2demo.other.Person;

import dagger.Component;


@ActivityScope
@Component(modules = {PersonModule.class},dependencies = {AppComponent.class})
public interface PersonComponent {
    Person getPerson();
    void inject(MainActivity activity);

}