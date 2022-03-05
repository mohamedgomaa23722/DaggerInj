package com.Dagg.daggerinject;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";
    //for view
    public River() {
        Log.d(TAG, "gomaa: River");
    }

    public String getWater(){
        return "Water";
    }
}
