package com.geniusnine.android.hindijokes.jokes;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geniusnine.android.hindijokes.R;

public class StudentJokesDetails extends AppCompatActivity {
    PagerAdapter adapter;
    ViewPager studentjokesjokesviewPager;
    String[] studentjokesjokeslist=StaticField.studentjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_jokes_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        studentjokesjokesviewPager = (ViewPager) findViewById(R.id.ViewPager);
        // Pass results to ViewPagerAdapter Class
        adapter = new StudentJokesViewPagerAdapter(StudentJokesDetails.this,studentjokesjokeslist);
        // Binds the Adapter to the ViewPager
        studentjokesjokesviewPager.setAdapter(adapter);
        int pos = getIntent().getIntExtra("key", 0);
        studentjokesjokesviewPager.setCurrentItem(pos);



    }
}