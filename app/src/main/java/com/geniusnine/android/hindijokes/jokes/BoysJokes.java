package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class BoysJokes extends AppCompatActivity {
    ListView BoysjokesListView;
    ArrayAdapter<String> adapter;
    String[] BoysJokeslist=StaticField.boysjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_jokes);
        BoysjokesListView=(ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_boys_jokes,R.id.BoysJokestextview, BoysJokeslist);


        // Assign adapter to ListView
        BoysjokesListView.setAdapter(adapter);
        BoysjokesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(BoysJokes.this, BoysJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }

}

