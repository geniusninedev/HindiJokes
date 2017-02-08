package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class StudentJokes extends AppCompatActivity {
    ListView StudentJokesListView;
    ArrayAdapter<String> adapter;
    String[] StudentJokeslist=StaticField.studentjokeslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_jokes);
        StudentJokesListView=(ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_student_jokes,R.id.Studentjokestextview, StudentJokeslist);


        // Assign adapter to ListView
        StudentJokesListView.setAdapter(adapter);
        StudentJokesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(StudentJokes.this, StudentJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }

}
