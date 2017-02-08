package com.geniusnine.android.hindijokes.jokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.hindijokes.R;

public class HoliJokesDetail extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holi_jokes_detail);
        List = new String[] {

                "Holi Pe Ladki Ghabrate Hue Apne Boy-Friend Ko Boli: “Please Pani Wala Gubbara Mat Fenkna, Main Gili Ho Jaungi”\n" +
                        "\n" +
                        "Ladka: “Achha Aur Khud Jab Tight T-Shirt Pehan Kar Gubbare Dikhati Hai Tab Socha Hai Hum Kitne Gile Hote Honge“","Log aaj ke din Rang lagate hai ...\n" +
                "Aur baki ke din Rang Badalte hai","Heard a woman painted completely in holi colours saying other \"yeh toh kuch bhi nai mera roj ka make-up isse jyada hota hai\"",
                "Hi. Maine yeh msg aapko Diwali ki badhayi dene ke liye kiya hai.\n" +
                        "\n" +
                        "Aaj is aazadi ke avsar par hume yeh raakhi ka tyohaar acche se manana chahiye aur gharo me deepak laga kar holi khelni chahiye, kyunki aaj hi ke din Gandhiji ne Ravan ko maarkar Mahabharat ka yuddh jeeta tha aur America ko aazad karaya tha.\n" +
                        "\n" +
                        "Isliye ek baar fir se aapko janam din ki bahut bahut shubhkamnaye.\n" +
                        "Ishwar aapko bhaang me bheege.. iss msg ko jhelne ki shakti de..\n" +
                        "\"MERRY X'MAS\"","Anushka: Baby, tum itni gaali kyun dete ho?\n" +
                "\n" +
                "Virat : Bura na maano Kohli hai","Arz kiya h,\n" +
                "Holi Ke Din Jee Bhar K Rango se KheLo\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "wah-wah\n" +
                ".\n" +
                ".\n" +
                "Holi Ke Din Jee Bhar K Rango se KheLo\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "ACP Says- Daya, In Sab K Finger-Print Le Lo","Ek tym tha jab Bill Gates ne American bank se 10,0000 Lacs ka loan manga tha but\n" +
                ".\n" +
                ".\n" +
                "American bank ne voh Laon refuse kar dia tha orrr 2001 me Bill gates ne vo bank hi khreed liya..\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "1 aaj ka din hai, ICICI walo ne mera\n" +
                "15,000/- ka loan cancel kiya hai\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "naa jiii naa maaf karne kaa toh sawal hi paida nhi hota.","Boy To Father: papa ek glass paani\n" +
                "de do,\n" +
                "\n" +
                "Father: khud uth k pe lo,\n" +
                "\n" +
                "Boy: please de do na……!\n" +
                "\n" +
                "Father: ab manga to thappad maronga :/\n" +
                "\n" +
                "Boy: thappad marne aao to pani letay aana ","Holi par Bazaar se\n" +
                "Gunjiya khareed ke, FB\n" +
                "par self made bata kar\n" +
                "photo me 50 bando ko\n" +
                "tag karne walo, Holi ke\n" +
                "agle din tumhe lagne\n" +
                "wali dast bhi aane se\n" +
                "pehle kahengi ki Aap\n" +
                "Bhutiye Hain","Today was the day when if someone is asked - kahan ja rahe ho?\n" +
                "\n" +
                "And one can proudly say \"muh kala karwane\"","ek bar ek friend ne dusre friend se puccha , tune apne bete ka nam hola kyu rkha hain then second friend said kyki ye holi ke din paida huaa tha ," +
                " then first friend said sukr hain ki tera beta lori k din paida nhi huaa nhi to uska nam l@da hota",
                "Holi se ek din pehle\n" +
                "Purane Jute,\n" +
                "Sabse Purani Shirt,\n" +
                "Jeans ya Kurta Paijama ko\n" +
                "Ghar me badhi ijaat ke sath dekha jata hai ..!! \uD83D\uDE06"


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(HoliJokesDetail.this,List);
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

