package com.example.paveljacko.dagger2test;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paveljacko.library.Level1Application;
import com.example.paveljacko.library.Level1Class;
import com.example.paveljacko.library.Level2Class;
import com.example.paveljacko.library.Level3Class;
import com.example.paveljacko.library.Level3Module;
import com.example.paveljacko.library.Level4Class;
import com.example.paveljacko.library.Level5Class;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class Level3Fragment extends Fragment {

    @Inject
    Level1Class level1Class;
    @Inject
    Level2Class level2Class;
    @Inject
    Level3Class level3Class;
    @Inject
    Level4Class level4Class;

    public Level3Fragment() {
        Log.d("LIFECYCLE", getClass().getSimpleName() + " Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Level2Activity level2Activity = (Level2Activity) getActivity();
        Level1Application level1Application = (Level1Application) getActivity().getApplication();
        level2Activity.level2ExtendComponent().inject(this);

        /*DaggerLevel3Component.builder()
                .level2Component(level2Activity.level2ExtendComponent())
                .level3Module(new Level3Module()).build().inject(this);
        Level5Class level5Class = new Level5Class();*/
        //inje

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level2Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level3Class);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
