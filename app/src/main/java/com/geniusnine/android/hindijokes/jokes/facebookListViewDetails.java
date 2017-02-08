package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class facebookListViewDetails extends AppCompatActivity {
    PagerAdapter adapter;
    ViewPager facebookjokesviewPager;
    String[] facebookjokeslist=StaticField.facebookjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_list_view_details);
        facebookjokesviewPager=(ViewPager)findViewById(R.id.ViewPager);
        adapter=new FaceBookViewPagerAdapter(getApplicationContext(),facebookjokeslist);
        facebookjokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        facebookjokesviewPager.setCurrentItem(pos);

    }
}