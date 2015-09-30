package com.example.paveljacko.library;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by paveljacko on 26/09/15.
 */
public class Level2Class {
    @Inject
    public Level2Class(Level1Class level1Class) {
        Log.d("BUM", getClass().getSimpleName() + " Created");

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
    }
}
