/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.example.paveljacko.library;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Level1Module {

    private final Level1Application level1Application;

    public Level1Module(Level1Application avengersApplication) {

        this.level1Application = avengersApplication;
    }

    @Provides @Singleton
    Level1Application level1Application () { return level1Application; }

    @Provides @Singleton
    Level1Class level1Class () { return new Level1Class(); }
}
