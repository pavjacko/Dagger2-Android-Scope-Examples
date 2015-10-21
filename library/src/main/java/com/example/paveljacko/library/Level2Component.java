package com.example.paveljacko.library;

import dagger.Component;

/**
 * Created by paveljacko on 26/09/15.
 */
@Level2Scope
@Component(dependencies = Level1Component.class, modules = Level2Module.class)
public interface Level2Component  extends Level1Component{

    //void inject (Level2Activity level2Activity);
    //void inject (Level3Fragment level3Fragment);

    Level2Class level2Class();
}
