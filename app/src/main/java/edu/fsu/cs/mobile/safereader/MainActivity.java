package edu.fsu.cs.mobile.safereader;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean night, brightness, scale;
    TextView jekyll, moby, expectations, egg, scream, heart, lottery, magi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jekyll = (TextView) findViewById(R.id.jekyll);
        moby = (TextView) findViewById(R.id.moby);
        expectations = (TextView) findViewById(R.id.expectations);
        egg = (TextView) findViewById(R.id.egg);
        scream = (TextView) findViewById(R.id.scream);
        heart = (TextView) findViewById(R.id.heart);
        lottery = (TextView) findViewById(R.id.lottery);
        magi = (TextView) findViewById(R.id.magi);

        jekyll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                JekyllFragment fragment = new JekyllFragment();
                trans.add(R.id.totalContainer, fragment, "Dr. Jekyll and Mr. Hyde");
                trans.commit();
            }
        });

        moby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                MobyFragment fragment = new MobyFragment();
                trans.add(R.id.totalContainer, fragment, "Moby Dick: Chapter 1");
                trans.commit();
            }
        });

        expectations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                ExpectationsFragment fragment = new ExpectationsFragment();
                trans.add(R.id.totalContainer, fragment, "Great Expectations");
                trans.commit();
            }
        });

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                EggFragment fragment = new EggFragment();
                trans.add(R.id.totalContainer, fragment, "The Egg");
                trans.commit();
            }
        });

        scream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                ScreamFragment fragment = new ScreamFragment();
                trans.add(R.id.totalContainer, fragment, "I Have No Mouth and I Must Scream");
                trans.commit();
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                HeartFragment fragment = new HeartFragment();
                trans.add(R.id.totalContainer, fragment, "The Tell-Tale Heart");
                trans.commit();
            }
        });

        lottery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                LotteryFragment fragment = new LotteryFragment();
                trans.add(R.id.totalContainer, fragment, "The Lottery");
                trans.commit();
            }
        });

        magi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction trans = manager.beginTransaction();
                MagiFragment fragment = new MagiFragment();
                trans.add(R.id.totalContainer, fragment, "The Gift of the Magi");
                trans.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.night:
                if(item.isChecked()){
                    item.setChecked(false);
                    night = false;
                }
                else{
                    item.setChecked(true);
                    night = true;
                }
                break;
            case R.id.brightness:
                if(item.isChecked()){
                    item.setChecked(false);
                    brightness = false;
                }
                else{
                    item.setChecked(true);
                    brightness = true;
                }
                break;
            case R.id.autoscale:
                if(item.isChecked()){
                    item.setChecked(false);
                    scale = false;
                }
                else{
                    item.setChecked(true);
                    scale = true;
                }
                break;
        }

        return true;
    }
}
