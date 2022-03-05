package com.Dagg.daggerinject;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component (modules = RiverModule.class)
public interface AppComponent {

    River getRiver();


}
