package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class AloknathJokes extends AppCompatActivity {
    ListView AloknathListView;
    ArrayAdapter<String> adapter;
    String[] AloknathJokeslist=StaticField.aloknathjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloknath_jokes);
        AloknathListView=(ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_aloknath_jokes,R.id.Aloknathtextview, AloknathJokeslist);
        // Assign adapter to ListView
        AloknathListView.setAdapter(adapter);
        AloknathListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AloknathJokes.this, AloknathJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);
            }
        });

    }

}

