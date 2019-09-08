package com.example.dagger2prodev;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponet {

    void inject(MainActivity mainActivity);
}
