package com.example.paveljacko.library;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by paveljacko on 26/09/15.
 */
@Singleton
@Component(modules = Level1Module.class)
public interface Level1Component {
    void inject(Level1Application level1Application);

    Level1Class level1Class();
}
