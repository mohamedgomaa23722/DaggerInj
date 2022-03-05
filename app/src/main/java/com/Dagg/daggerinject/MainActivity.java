package com.Dagg.daggerinject;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication) getApplication()).getAppComponent();
        CoffeeComponent coffeeComponent=component.getCoffeeComponentBuilder().milk(4).sugar(2).build();
        coffeeComponent.inject(this);


        Log.d(TAG, "gomaa: " +
                "\ncoffee 1 :"+coffee +
                "\ncoffee 2 :"+coffee2 +
                "\n farm for coffee1:" + coffee.river +
                "\n farm for coffee2: " + coffee2.river);
    }
}