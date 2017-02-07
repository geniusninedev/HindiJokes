package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.PappuJokes.PappuJokes;
import com.geniusnine.android.hindijokes.R;
import com.geniusnine.android.hindijokes.RajnikantJokes.RajnikantJokes;
import com.geniusnine.android.hindijokes.SantaBantaJokes.SantaBantaJokes;

public class Jokes extends AppCompatActivity {

    ArrayAdapter<String> jokesCategoryAdapter;
    ListView listViewCategories;
    String[] jokesCategories = {"Aap bhutiye hai", "Bollywood Jokes", "Cricket Jokes", "Facebook Jokes", "Best Jokes", "Holi Jokes"
            , "Pappu Jokes", "Rajnikant Jokes", "Santa Banta Jokes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        listViewCategories = (ListView) findViewById(R.id.listViewCategories);

        jokesCategoryAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_jokes, R.id.textViewCategories, jokesCategories);
        listViewCategories.setAdapter(jokesCategoryAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listViewCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 5) {
                    startActivity(new Intent(Jokes.this, HoliJokes.class));
                }
                if (position == 6) {
                    startActivity(new Intent(Jokes.this, PappuJokes.class));
                }
                if (position == 7) {
                    startActivity(new Intent(Jokes.this, RajnikantJokes.class));
                }
                if(position==8){
                    startActivity(new Intent(Jokes.this,SantaBantaJokes.class));
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }
}
