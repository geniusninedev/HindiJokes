package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class GirlsJokes extends AppCompatActivity {
    ListView GirlsJokeslistListView;
    ArrayAdapter<String> adapter;
    String[] GirlsJokeslist=StaticField.girlsjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_jokes);
        GirlsJokeslistListView=(ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_girls_jokes,R.id.GirlsJokestextview, GirlsJokeslist);


        // Assign adapter to ListView
        GirlsJokeslistListView.setAdapter(adapter);
        GirlsJokeslistListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(GirlsJokes.this, GirlsJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }

}