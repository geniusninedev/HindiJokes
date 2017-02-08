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

import com.geniusnine.android.hindijokes.R;

public class HoliJokes extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holi_jokes);
        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[]{
                "Holi Pe Ladki Ghabrate Hue Apne Boy-Friend Ko Boli: “Please Pani Wala Gubbara Mat Fenkna, Main Gili Ho Jaungi”","Log aaj ke din Rang lagate hai ..\n"+
                "Aur baki ke din Rang Badalte hai","Heard a woman painted completely in holi colours saying other \"yeh toh kuch bhi nai mera roj ka make-up isse jyada hota hai\"",
                "Hi. Maine yeh msg aapko Diwali ki badhayi dene ke liye kiya hai.","Anushka: Baby, tum itni gaali kyun dete ho?\n" +
                "Virat : Bura na maano Kohli hai","Arz kiya h,\n" +
                "Holi Ke Din Jee Bhar K Rango se KheLo\n" +
                "wah-wah","Ek tym tha jab Bill Gates ne American bank se 10,0000 Lacs ka loan manga tha but","Boy To Father: papa ek glass paani\n" +
                "de do,\n" +
                "Father: khud uth k pe lo,\n" +
                "Boy: please de do na……!","Holi par Bazaar se\n" +
                "Gunjiya khareed ke, FB\n" +
                "par self made bata kar\n" +
                "photo me 50 bando ko\n" +
                "tag karne walo, Holi ke\n" +
                "agle din tumhe lagne\n" +
                "wali dast bhi aane se\n" +
                "pehle kahengi ki Aap\n" +
                "Bhutiye Hain","Today was the day when if someone is asked - kahan ja rahe ho?\n" +
                "And one can proudly say \"muh kala karwane\"","ek bar ek friend ne dusre friend se puccha , tune apne bete ka nam hola kyu rkha hain then second friend said kyki ye holi ke din paida huaa tha ," +
                " then first friend said sukr hain ki tera beta lori k din paida nhi huaa nhi to uska nam l@da hota","Holi se ek din pehle\n" +
                "Purane Jute,\n" +
                "Sabse Purani Shirt,\n" +
                "Jeans ya Kurta Paijama ko\n" +
                "Ghar me badhi ijaat ke sath dekha jata hai ..!! \uD83D\uDE06"
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_holi_jokes,R.id.textViewHoli, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HoliJokes.this, HoliJokesDetail.class);
                i.putExtra("key", position);
                startActivity(i);


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