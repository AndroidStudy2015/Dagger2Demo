package com.dagger2.www.dagger2demo.di.module;

import com.dagger2.www.dagger2demo.di.scope.ActivityScope;
import com.dagger2.www.dagger2demo.other.Person;

import dagger.Module;
import dagger.Provides;


@Module
public class PersonModule {

    @ActivityScope
    @Provides
    public Person providePerson() {
        Person person = new Person();
        person.setName("Green");
        person.setAge(100);
        return person;
    }
}
