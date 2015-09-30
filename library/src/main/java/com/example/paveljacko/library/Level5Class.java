package com.example.paveljacko.library;

import android.util.Log;

import javax.inject.Inject;

public class Level5Class {
    @Inject
    Level3Class level3Class;

    public Level5Class() {
        Log.d("BUM", getClass().getSimpleName() + " Created");

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level3Class);
    }
}
