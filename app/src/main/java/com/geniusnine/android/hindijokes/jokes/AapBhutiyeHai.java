package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.hindijokes.R;

public class AapBhutiyeHai extends AppCompatActivity {
ListView AapBhutiyeHaiListView;
    ArrayAdapter<String> adapter;
    String[] aapbhutiyehailist=StaticField.AapBhutiyeHailist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aap_bhutiye_hai);
        AapBhutiyeHaiListView=(ListView)findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_aap_bhutiye_hai,R.id.AapBhutiyeHaitextview, aapbhutiyehailist);


        // Assign adapter to ListView
        AapBhutiyeHaiListView.setAdapter(adapter);
        AapBhutiyeHaiListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AapBhutiyeHai.this, AapBhutiyeHaiJokesDetails.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

    }

}

