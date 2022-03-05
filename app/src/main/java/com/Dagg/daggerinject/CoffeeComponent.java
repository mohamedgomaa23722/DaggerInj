package com.Dagg.daggerinject;


import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);
}
