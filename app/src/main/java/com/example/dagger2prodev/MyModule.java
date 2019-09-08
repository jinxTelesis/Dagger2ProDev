package com.example.dagger2prodev;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {


    @Provides
    @Singleton // there is a singleton annontation in java
    static MyExample provoideMyExample(){
        return new MyExampleImpl();
    }
}
