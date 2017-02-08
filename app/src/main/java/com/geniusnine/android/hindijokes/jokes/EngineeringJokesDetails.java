package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class EngineeringJokesDetails extends AppCompatActivity {
    ViewPager EngineeringJokesviewPager;
    PagerAdapter adapter;
    String[] enggjokesList=StaticField.enggjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_jokes_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        EngineeringJokesviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new EngineeringJokesViewPagerAdapter(EngineeringJokesDetails.this,enggjokesList);
        // Binds the Adapter to the ViewPager
        EngineeringJokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        EngineeringJokesviewPager.setCurrentItem(pos);



    }
}