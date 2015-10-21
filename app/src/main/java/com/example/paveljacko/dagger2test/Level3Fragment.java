package com.example.paveljacko.dagger2test;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paveljacko.library.DaggerLevel3Component;
import com.example.paveljacko.library.Level1Application;
import com.example.paveljacko.library.Level1Class;
import com.example.paveljacko.library.Level2Class;
import com.example.paveljacko.library.Level2Module;
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


    private Level3ExtendComponent level3ExtendComponent;


    public Level3Fragment() {
        Log.d("LIFECYCLE", getClass().getSimpleName() + " Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Level2ExtendComponent component = null;
        if(getActivity() instanceof Level2Activity) {
            Level2Activity activity = (Level2Activity) getActivity();
            component = activity.level2ExtendComponent();
        } else {
            Level2ActivityCopy activity = (Level2ActivityCopy) getActivity();
            component = activity.level2ExtendComponent();
        }

        Level1Application level1Application = (Level1Application) getActivity().getApplication();



        level3ExtendComponent = DaggerLevel3ExtendComponent.builder()
                .level2Component(component)
                .level3Module(new Level3Module())
                .build();


        level3ExtendComponent.inject(this);
        //inje

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level2Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level3Class);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
