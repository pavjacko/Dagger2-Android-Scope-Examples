package com.example.paveljacko.dagger2test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.paveljacko.library.Level1Application;
import com.example.paveljacko.library.Level1Class;
import com.example.paveljacko.library.Level2Class;
import com.example.paveljacko.library.Level2Module;

import javax.inject.Inject;

public class Level2ActivityCopy extends AppCompatActivity {

    @Inject
    Level1Class level1Class;
    @Inject
    Level2Class level2Class;

    private Level2ExtendComponent level2ExtendComponent;

    public Level2ActivityCopy() {
        Log.d("LIFECYCLE", getClass().getSimpleName() + " Created");
    }

    public Level2ExtendComponent level2ExtendComponent() {
        return level2ExtendComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Level1Application level1Application = (Level1Application) getApplication();
        level2ExtendComponent = DaggerLevel2ExtendComponent.builder()
                .level1Component(level1Application.level1Component())
                .level2Module(new Level2Module())
                .build();

        level2ExtendComponent.inject(this);

        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Level2ActivityCopy.this, Level2ActivityCopy.class));
            }
        });

        Log.d("BUM", getClass().getSimpleName() + " try access: " + level1Class);
        Log.d("BUM", getClass().getSimpleName() + " try access: " + level2Class);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent intent = new Intent("");

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
