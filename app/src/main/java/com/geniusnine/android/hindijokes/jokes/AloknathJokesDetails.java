package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class AloknathJokesDetails extends AppCompatActivity {
    ViewPager AloknathaviewPager;
    PagerAdapter adapter;
    String Aloknathalist[]=StaticField.aloknathjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloknath_jokes_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AloknathaviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new AloknathViewPagerAdapter(AloknathJokesDetails.this,Aloknathalist);
        // Binds the Adapter to the ViewPager
        AloknathaviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        AloknathaviewPager.setCurrentItem(pos);



    }
}

