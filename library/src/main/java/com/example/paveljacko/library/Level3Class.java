package com.example.paveljacko.library;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by paveljacko on 26/09/15.
 */
public class Level3Class {
    @Inject
    public Level3Class(Level1Class level1Class, Level2Class level2Class) {
        Log.d("BUM", getClass().getSimpleName() + " Created");

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level2Class);
    }
}
