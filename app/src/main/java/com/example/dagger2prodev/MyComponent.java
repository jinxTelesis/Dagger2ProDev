package com.example.dagger2prodev;


import javax.inject.Singleton;

import dagger.Component;

@Singleton //both need the singleton
@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);
}
