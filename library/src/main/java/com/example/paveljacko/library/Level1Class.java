package com.example.paveljacko.library;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by paveljacko on 26/09/15.
 */
public class Level1Class {
    @Inject
    public Level1Class() {
        Log.d("BUM", getClass().getSimpleName() + " Created");
    }
}
