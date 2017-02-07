package com.geniusnine.android.hindijokes.SantaBantaJokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.hindijokes.R;
import com.geniusnine.android.hindijokes.jokes.ViewPagerAdapter;

public class SantaBantaJokesDetail  extends AppCompatActivity{
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa_banta_jokes_detail);
        List = new String[] {
"Santa Sharab Pikar\n" +
        "Sadhu Se Takra Gya\n" +
        "Sadhu Gusse Me- Aye Murkh\n" +
        "Me Tujhe SHRAAP Deta Hu\n" +
        "Santa-Rukiye Maharaj\n" +
        "Me 1 Glass Leke Ata hu\n" +
        "\n","Phale Raabadi Bihaar ki Mukhyamantri bani,\n" +
                "Phir Chaay vaala bhaarat ka Pradhaanamantri bana.\n" +
                "aur ab Panir-Selvam taamilanaadu ke Mukhyamantri ban gae.\n" +
                "Maa sach kahati hai, doodh mein vaakai bahut shakti hai.\n" ,"Baahubali-II Film mein ab ye afavaah kisane phailaayi ki “katappa” ki Patni ka naam Silbatta hai,\n" +
                "Beti ka naam Dupatta aur Pote ka naam Desi katta hai aur sunane mein aaya hai ki usake gaanv ka naam Hadappa hai, Usaka favourite food " +
                "\"Golgppa” hai. Aur sootro ke havaale se pata chala hai… Ktppa ke khaandaan ka aakhiri waaris cricketer raabin uthappa hai.\n" +
                "\n","Santa apni grlfrnd k saath 1st date pe : Ye meri pehli date hai darling agr koi galti ya kami reh jaye toh chhota bhai samajh k maaf kr dena.\n"
,"Sardar ko sapne me ek ladki ne chappal mari,\n" +
                "2 din tak sardar apne bank nahi gaya,\n" +
                "Qnki bank me likha tha..\n" +
                "“hum aapke sapne ko hakikat me badalte hain”\n","Santa: I’ve Been Sending E-mails To William Shakespare…\n" +
                "Banta: William Shakespare Is Dead, Stupid…\n" +
                "Santa: No Wonder He Hasn’t Replied As Well…\n"



        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.PagerInSantaJokes);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(SantaBantaJokesDetail.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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

