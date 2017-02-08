package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class EngineeringJokes extends AppCompatActivity {
    ListView enggjokeslistView;
    ArrayAdapter<String> adapter;
    String[] enggjokeslist=StaticField.enggjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_jokes);
        enggjokeslistView=(ListView)findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_engineering_jokes,R.id.Enggneeringjokestextview,enggjokeslist);
        enggjokeslistView.setAdapter(adapter);
        enggjokeslistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(EngineeringJokes.this, EngineeringJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);
            }
        });
    }
}
