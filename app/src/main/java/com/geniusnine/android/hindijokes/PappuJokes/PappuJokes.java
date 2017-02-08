package com.geniusnine.android.hindijokes.PappuJokes;

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

public class PappuJokes extends  AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pappu_jokes);
        listView = (ListView) findViewById(R.id.pappujokeslistView);

        String[] values = new String[]{
             "Teacher Class Mein Pappu Se Hindi Ka Muhavra Puchti Hai.\n" +
                "Teacher: “Pappu Beta Suraj Ko Diya Dikhana Ka Koi Example Do”","Pappu Ne Apne Dost Golu Se Puchha\n" +
                "Pappu: “Oye! Vi@gra Or Government Office Mein Kya Similarity Hai?”\n" +
                "Golu: “Mujhe Nahi Pata.”","Pappu Ki Ladkio Se Pange Lene Ki Adat Se Sab Dukhi The Aur Roj Usko Galiya Padti Thhi.\n" +
                "\n" +
                "To Uske Principal Ne Kaha Ki Aaj Tujhe Bhagwan Ke Aage Kasam Khani Hogi Ki Ladkiyo Ko Tang Nahi Karunga.","Teacher Ne Pappu Ko " +
                "“Girdhar Barse Angan Main” Mein Kavita Likhne Ko Kaha\n" +
                "Pappu Ne Likha","Pappu Gaon Ke Primary School Me Padhta Tha.\n" +
                "\n" +
                "Ek Din Wahaan Par (Deupty) Auditor Aaya Aur Usne Sabhi Bachcho Ka Test Lene Ke Liye Ek Sawaal Puchha.","College Mein Pappu Aur Uski Ek Friend Canteen Ke Bahar Bethe Baatein Kar Rahe Thhe\n" +
                "Pappu Ki Friend Ne Ahista Se Pappu Ko Bola\n" +
                "Ladki: “Main Apni Zindagi Mein Koi Lamba Hath Maarna Chahti Hoon”" +
                "Pappu Kameene Pan Se Bola: “Tum Sirf Hath Maaro Lamba Khud Hi Ho Jayega“","Pappu : Ek Manforce dena.\n" +
                "Chemist : Tum toh Sharma ji k bete ho naa ??\n" +
                "Pappu: Uncle Mentos dena, Ek do Vicks b de dena gala kharab hai . dawa ka naam bhi nahi nikal raha thik se ..","Pappu:- dad me aaj aapko ek baat batana chahta\n" +
                "hun...\n" +
                "Dad:- bolo..\n" +
                "Pappu:- Dad maine Facebook pe ladkiyon ke naam\n" +
                "se 5 fake I'd banayi hain.." ,"Pappu Ka Dost Uske Ghar\n" +
                "Pehli Baar Gaya..!\n" +
                "Yaar Pappu, Tera Ladka\n" +
                "Ekdam Tere Jaisa\n" +
                "Dikhta Hai..!!","Mom : beta papa ka naam bolo \n" +
                "Son : Lakshman Shivaramakrishnan \n" +
                "Mom : Chalo hogayi aaj ki pooja.","How To Teach A Girl Dance In Just 5 Sec?\n" +
                "Simple The Best Answer Given By Pappu\n" +
                "Throw A Cockroach On Her.","Ek Din School Mein Teacher Ne Pappu Se Ek Sawal Puchha?\n" +
                "Teacher: “Pappu Batao, Salwar Ke Nade Ko English Mein Kya Kehte Hai?”\n" +
                "Pappu: “Ji Mam, P.H.D.”\n" +
                "Teacher Hairan Hokar: “Iska Kya Matlab Hai?”","Papa- Beta tum shaadi kab karoge??\n" +
                "Beta- Main to shaadi diwali pe karunga!\n" +
                "Papa- Wo kyun??\n" +
                "Beta- Kya pata diwali offer me 1 ke sath 1 free mil jaaye.","Pappu Apne Baap (Santa) Ke Paas Gaya Aur Kehne Laga.\n" +
                "Pappu: “Papa, Mujhe Shadi Karni Hai.”\n" +
                "Santa: “Beta, Kis Se?”\n" +
                "Pappu: “Dadi Se.”\n" +
                "Santa Gusse Se: “Kamine, Wo Meri Maan Hai.”\n" +
                "Pappu: “To Phir Aapne Meri Maan Se Shadi Kyun Ki?“","Teacher Class Mein Bachho Ko Pada Rahi Thhi\n" +
                "Teacher: “Delhi Mein Kutubminaar Hai”\n" +
                "Pappu Piche Wale Bench Pe So Raha Thha, Teacher Ne Ye Dekha Aur Usko Jag Ake Boli\n" +
                "Teacher: “What Did I Say?”\n" +
                "Pappu Hadbadate Hue: “Delhi Mey Kutta Bimar Hai“","Jab Pappu Paida Hua To Santa Doctor Se Salah Lene Gaya Ki Bacho Ki Care Kese Ki Jaye.\n" +
                "Doctor: “Bache Ko Paani Dene Se Pehle Boil Kar Lena Chahiye”\n" +
                "Santa: “Lekin Doctor Sahab, Boil Karne Se Bacha Marr To Nahi Jayega“","Pappu Ne Is Bar Rakshabandhan Par Apne Dosto Ke Sath Milkar Discuss Kiya.\n" +
                "Pappu: “Yaar, Aaj Ke Din Koi Bhi Ladki Kisi Bhi Ladke Ko Bhai Bana Leti Hai, Aur Duniya Kuch Nahi Kahti Ulta Sab Khush Hote Hai”\n" +
                "Dost: “Baat To Thik Hai, Phir?”\n" +
                "Pappu: “To Problem Ye Hai Ki Karvachauth Wale Din Kisi Ko Bhi Pati Kyu Nahi Bana Sakti?”\n" +
                "Hume Insaaf Chahiye…","Pappu Apne Teacher Se Puchhta Hai.\n" +
                "Pappu: “Sir, Jo Kaam Maine Kiya Hi Nahi, Kya Uske Liye Mujhe Sazaa Milni Chahiye?”\n" +
                "Teacher: “Bilkul Bhi Nahi.”\n" +
                "Pappu: “Sir, To Maine Aaj Ka Home-Work Nahi Kiya.”","Line writtern behind a Rickshaw-\n" +
                "Renault ka Baap,Nissan ka Nana\n" +
                "Yeh Rickshaw chala raha hai Pappu deewana.","Interviewer: Civil engineering kyun kiya?\n" +
                "Pappu : Builder banna tha.\n" +
                "Interviewer: Koi bhi ek famous builder ka naam batao?\n" +
                "Pappu : Bob The Builder.","*During exam*\n" +
                "Golu - \"2nd question ka answer bata na\"\n" +
                "Pappu - \"Kaho na pyaar hai dekhi hai?\"\n" +
                "Golu - \"Han. 22 baar\"\n" +
                "Pappu - \"Gaana sunega?\"\n" +
                "Golu - \"Han\"\n" +
                "Pappu - \"Na Tum Jano Na Hum\"","Killer One:\n" +
                "Pappu Mount Everest Pe gaya.\n" +
                "3 Baba Baithe The\n" +
                "Aur Tambaku Ragad Rahe the.\n" +
                "Pappu- Baba Ye Kya hai?\n" +
                "Baba- Masala..\n" +
                "Pappu- O Teri, Everest Masale Aap Banate Ho ","Dad - \"Pappu Beta uncle ke pair padh\"\n" +
                "Pappu - *bows down* \"Par papa inke pair pe kuch likha hi nai hai\"","Dentist to Pappu - Apka daant nikalna padega\n" +
                "Pappu - paise lagenge?\n" +
                "Dentist - 200\n" +
                "Pappu - ye lo 50 rupye thoda sa DHEELA kar do nikaal me khud lunga. . ","Pappu ne JOB ke 1st din\n" +
                "Computer pe 11 ghante\n" +
                "guzare.\n" +
                "Boss khuhsi se: Good.. Aaj kya\n" +
                "kiya ??\n" +
                "Pappu : Keyboard ki ABCD aage\n" +
                "piche lagi thi,\n" +
                "Wo sahi kar di... "
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_pappu_jokes,R.id.textViewPappu,values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PappuJokes.this, PappuJokesDetail.class);
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