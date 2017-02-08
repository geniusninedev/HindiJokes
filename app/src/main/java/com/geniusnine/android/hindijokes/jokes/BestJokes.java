package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class BestJokes extends AppCompatActivity {
    ListView bestjokesListView;
    ArrayAdapter<String> adapter;
    String[] BestJokeslist = StaticField.bestjokeslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_jokes);
        bestjokesListView = (ListView) findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_face_book_jokes, R.id.facebooktextview, BestJokeslist);


        // Assign adapter to ListView
        bestjokesListView.setAdapter(adapter);
        bestjokesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(BestJokes.this, BestJokesListViewDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }
}