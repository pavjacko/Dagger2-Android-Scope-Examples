/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.example.paveljacko.library;

import dagger.Module;
import dagger.Provides;

@Module
public class Level3Module {

    @Provides @Level3Scope
    Level3Class level3Class (Level1Class level1Class, Level2Class level2Class) { return new Level3Class(level1Class, level2Class); }
}
