package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class Jokes extends AppCompatActivity {

    ArrayAdapter<String> jokesCategoryAdapter ;
    ListView listViewCategories;
    String[] jokesCategories = {"Aap bhutiye hai", "Bollywood Jokes", "Cricket Jokes", "Facebook Jokes","Best Jokes","Holi Jokes", "Pappu Jokes",
                                "Rajnikant Jokes","Santa Banta Jokes","Alok Nath Jokes","Boys Jokes","Student Jokes","Girls Jokes","Engineering Jokes"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        listViewCategories = (ListView)findViewById(R.id.listViewCategories);

        jokesCategoryAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_jokes, R.id.textViewCategories, jokesCategories);
        listViewCategories.setAdapter(jokesCategoryAdapter);
        listViewCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Jokes.this,AapBhutiyeHai.class));
                }
                if(position==1){
                    startActivity(new Intent(Jokes.this,BollywoodJokes.class));
                }
                if(position==2){
                    startActivity(new Intent(Jokes.this,CricketJokes.class));
                }
                if(position==3){
                    startActivity(new Intent(Jokes.this,FaceBookJokes.class));
                }
                if(position==4){
                    startActivity(new Intent(Jokes.this,BestJokes.class));
                } if(position==5){
                    startActivity(new Intent(Jokes.this,BestJokes.class));
                }
                if(position==9){
                    startActivity(new Intent(Jokes.this,AloknathJokes.class));
                }if(position==10){
                    startActivity(new Intent(Jokes.this,BoysJokes.class));
                }
                if(position==11){
                    startActivity(new Intent(Jokes.this,StudentJokes.class));
                }
                if(position==12){
                    startActivity(new Intent(Jokes.this,GirlsJokes.class));
                }
                if(position==13){
                    startActivity(new Intent(Jokes.this,EngineeringJokes.class));
                }
            }
        });
    }
}
