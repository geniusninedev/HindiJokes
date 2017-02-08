package com.geniusnine.android.hindijokes.jokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class Jokes extends AppCompatActivity {

    ArrayAdapter<String> jokesCategoryAdapter ;
    ListView listViewCategories;
    String[] jokesCategories = {"Aap bhutiye hai", "Aapke Submitted Tarike", "Alok Nath Jokes PJ", "Bollywood Hindi Jokes"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        listViewCategories = (ListView)findViewById(R.id.listViewCategories);

        jokesCategoryAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_jokes, R.id.textViewCategories, jokesCategories);
        listViewCategories.setAdapter(jokesCategoryAdapter);





    }
}
