package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class CricketJokes extends AppCompatActivity {
ListView cricketjokeslistView;
    ArrayAdapter<String> adapter;
    String[] criketlist=StaticField.cricketjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_jokes);
        cricketjokeslistView=(ListView)findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_cricket_jokes,R.id.cricketJokestextview,criketlist);
        cricketjokeslistView.setAdapter(adapter);
        cricketjokeslistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(CricketJokes.this, CricketJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);
            }
        });
    }
}
