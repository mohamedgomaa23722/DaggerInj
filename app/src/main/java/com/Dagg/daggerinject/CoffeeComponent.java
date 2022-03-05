package com.Dagg.daggerinject;


import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }
}
