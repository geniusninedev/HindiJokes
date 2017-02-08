package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.geniusnine.android.hindijokes.R;

public class BollywoodJokesDetails extends AppCompatActivity {
    PagerAdapter adapter;
ViewPager bollywoodjokesviewPager;
    String[] bollywoodjokeslist=StaticField.bollywoodjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        bollywoodjokesviewPager=(ViewPager)findViewById(R.id.ViewPager);
        adapter = new BollywoodjokesViewPagerAdapter(BollywoodJokesDetails.this,bollywoodjokeslist);
        bollywoodjokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        bollywoodjokesviewPager.setCurrentItem(pos);
    }
}
