package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class AapBhutiyeHaiJokesDetails extends AppCompatActivity {
    ViewPager AapBhutiyeHaiviewPager;
    PagerAdapter adapter;
    String Aapbutiyelist[]=StaticField.AapBhutiyeHailist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AapBhutiyeHaiviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(AapBhutiyeHaiJokesDetails.this,Aapbutiyelist);
        // Binds the Adapter to the ViewPager
        AapBhutiyeHaiviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        AapBhutiyeHaiviewPager.setCurrentItem(pos);



    }
    }

