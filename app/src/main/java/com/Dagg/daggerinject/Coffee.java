package com.Dagg.daggerinject;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
     Farm farm;

     River river;

    @Inject
    public Coffee(River river) {
        this.river=river;
    }

    @Inject
    public void connectElectricity(){
        Log.d(TAG, "gomaa: connecting......");
    }

    public String getCoffeeCup(){
        return farm.getBeans() +" + "+river.getWater();
    }
}
