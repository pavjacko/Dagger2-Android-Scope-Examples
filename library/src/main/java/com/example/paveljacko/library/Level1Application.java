package com.example.paveljacko.library;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by paveljacko on 26/09/15.
 */
public class Level1Application extends Application {

    private Level1Component level1Component;

    @Inject
    Level1Class level1Class;

    public Level1Application() {
        Log.d("LIFECYCLE", getClass().getSimpleName() + " Created");
    }

    @Override
    public void onCreate() {

        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {

        level1Component = DaggerLevel1Component.builder()
                .level1Module(new Level1Module(this))
                .build();

        level1Component.inject(this);

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
    }

    public Level1Component level1Component() {
        return level1Component;
    }
}
