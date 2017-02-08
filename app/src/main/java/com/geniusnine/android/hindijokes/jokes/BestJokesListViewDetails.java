package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class BestJokesListViewDetails extends AppCompatActivity {
    ViewPager bestjokesviewPager;
    PagerAdapter adapter;
    String bestjokeslist[]=StaticField.bestjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_jokes_list_view_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bestjokesviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new BestJokesViewPagerAdapter(BestJokesListViewDetails.this,bestjokeslist);
        // Binds the Adapter to the ViewPager
        bestjokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        bestjokesviewPager.setCurrentItem(pos);
    }
}