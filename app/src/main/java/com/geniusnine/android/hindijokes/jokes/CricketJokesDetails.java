package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.geniusnine.android.hindijokes.R;

public class CricketJokesDetails extends AppCompatActivity {
ViewPager viewPager;
    PagerAdapter adapter;
    String[] criketjokelist=StaticField.cricketjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_jokes_details);
        viewPager=(ViewPager)findViewById(R.id.ViewPager);
        adapter=new CricketViewPagerAdapter(getApplicationContext(),criketjokelist);
        viewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);
    }
}
