package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class BollywoodJokes extends AppCompatActivity {
ListView bollywoodjokeslistView;
    ArrayAdapter<String> adapter;
    String[] bollywoodjokeslist=StaticField.bollywoodjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bollywood_jokes);
        bollywoodjokeslistView=(ListView)findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_bollywood_jokes,R.id.BollywoodJokestextview,bollywoodjokeslist);
        bollywoodjokeslistView.setAdapter(adapter);
        bollywoodjokeslistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(BollywoodJokes.this, BollywoodJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }
}
