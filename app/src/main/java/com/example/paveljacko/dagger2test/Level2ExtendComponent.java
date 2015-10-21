package com.example.paveljacko.dagger2test;

import com.example.paveljacko.library.Level1Component;
import com.example.paveljacko.library.Level2Class;
import com.example.paveljacko.library.Level2Component;
import com.example.paveljacko.library.Level2Module;
import com.example.paveljacko.library.Level2Scope;

import dagger.Component;

/**
 * Created by paveljacko on 26/09/15.
 */
@Level2Scope
@Component(dependencies = Level1Component.class, modules = Level2Module.class)
public interface Level2ExtendComponent extends Level2Component {

    void inject(Level2Activity level2Activity);

    void inject(Level2ActivityCopy level2ActivityCopy);
}
