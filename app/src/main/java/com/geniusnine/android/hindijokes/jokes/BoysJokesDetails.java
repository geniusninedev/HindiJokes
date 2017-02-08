package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class BoysJokesDetails extends AppCompatActivity {
    ViewPager boysjokeslistviewPager;
    PagerAdapter adapter;
    String boysjokeslist[]=StaticField.boysjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_jokes_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        boysjokeslistviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new BollywoodjokesViewPagerAdapter(BoysJokesDetails.this,boysjokeslist);
        // Binds the Adapter to the ViewPager
        boysjokeslistviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        boysjokeslistviewPager.setCurrentItem(pos);



    }
}
