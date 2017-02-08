package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class GirlsJokesDetails extends AppCompatActivity {
    PagerAdapter adapter;
    ViewPager girlsjokesviewPager;
    String[] girlsjokeslist=StaticField.girlsjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_jokes_details);
        girlsjokesviewPager=(ViewPager)findViewById(R.id.ViewPager);
        adapter=new GirlsJokesViewPagesAdapter(getApplicationContext(),girlsjokeslist);
        girlsjokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        girlsjokesviewPager.setCurrentItem(pos);

    }
}
