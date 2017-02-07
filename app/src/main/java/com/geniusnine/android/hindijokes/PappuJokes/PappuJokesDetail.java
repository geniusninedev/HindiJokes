package com.geniusnine.android.hindijokes.PappuJokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.hindijokes.R;
import com.geniusnine.android.hindijokes.jokes.ViewPagerAdapter;

public class PappuJokesDetail  extends AppCompatActivity{
        String[] List;

        ViewPager viewPager;
        PagerAdapter adapter;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pappu_jokes_detail);
        List = new String[] {

     "Teacher Class Mein Pappu Se Hindi Ka Muhavra Puchti Hai.\n" +
                "\n" +
                "Teacher: “Pappu Beta Suraj Ko Diya Dikhana Ka Koi Example Do”\n" +
                "\n" +
                "Pappu: “Madam, Yeh To Wahi Baat Ho Gayi Ke Hum Bhalu Ko Apni Jhantein Dikhaye“","Pappu Ne Apne Dost Golu Se Puchha\n" +
                "\n" +
                "Pappu: “Oye! Vi@gra Or Government Office Mein Kya Similarity Hai?”\n" +
                "\n" +
                "Golu: “Mujhe Nahi Pata.”\n" +
                "\n" +
                "Pappu: “Dono 5 Minute Ke Kaam Ke Liye 1 Ghanta Khade Rakhte Hain.“","Pappu Ki Ladkio Se Pange Lene Ki Adat Se Sab Dukhi The Aur Roj Usko Galiya Padti Thhi.\n" +
                "\n" +
                "To Uske Principal Ne Kaha Ki Aaj Tujhe Bhagwan Ke Aage Kasam Khani Hogi Ki Ladkiyo Ko Tang Nahi Karunga.\n" +
                "\n" +
                "Principal Usko School Ke Ander Bane Mandir Mein Le Gaya Aur Bola.\n" +
                "\n" +
                "Principal: “Chal Ab Bhagwan Ke Aage Kasam Kha”\n" +
                "\n" +
                "Pappu Bhi Harami Thha, Dimag Mein Idea Aya Aur Bola\n" +
                "\n" +
                "Pappu: “Main Kasam Khata Hun Ki Aaj Ke Bad Har Ladki Ko Apni Maa Samjhunga”\n" +
                "\n" +
                "Aur Ye Bol Ke Dheere Se Bola, Jo Principal Sun Na Saka.\n" +
                "\n" +
                "Apne Hone Wale Bachho Ki","Teacher Ne Pappu Ko “Girdhar Barse Angan Main” Mein Kavita Likhne Ko Kaha\n" +
                "\n" +
                "Pappu Ne Likha\n" +
                "\n" +
                "Masti Bhri Ek Madam Aayi Josh Bhare Is Yauvan Mein,\n" +
                "\n" +
                "Saanjh Dhale Jab Piya Mile To Khaat Bichhi Fir Angan Mein ,\n" +
                "\n" +
                "Hoth Chusaye, Chuchi Dabayee, Land Ghusa Fir Jaanghan Mein,\n" +
                "\n" +
                "Wo Sisak Sisak Kar Chillayi Jab “Girdhar Barse Angan Mein","Pappu Gaon Ke Primary School Me Padhta Tha.\n" +
                "\n" +
                "Ek Din Wahaan Par (Deupty) Auditor Aaya Aur Usne Sabhi Bachcho Ka Test Lene Ke Liye Ek Sawaal Puchha.\n" +
                "\n" +
                "Deputy: “Bachchho Koi Aisi Cheez Batao Jiske Anek Naam Ho?”\n" +
                "\n" +
                "Pappu Ne Turant Apna Haath Khadaa Kar Diya.\n" +
                "\n" +
                "School Ke Head Master Ne Apna Maatha Peet Liya, Kyunki Wo Jaantaa Tha Ki Ye Pappu Haraami Hai Iskaa Jawaab Bhi Haraami Hi Hoga\n" +
                "\n" +
                "Pappu: “Uskaa Naam Hai Baal (Hair)”\n" +
                "\n" +
                "Deputy Hairani Se: “Beta Wo Kaisi, Iske Anek Naam Kahaan Hote Hain?”\n" +
                "\n" +
                "Pappu: “Sir Main Samjhata Hun”\n" +
                "\n" +
                "Sar Pe Hote Hain To Unhe “Julfain” Kahte Hain,\n" +
                "\n" +
                "Aankho Ke Ke Upar Hoote Hain To Unhe “Bhon” Kahte Hain,\n" +
                "\n" +
                "Chhatee Pe Hote Hain To Unhe “Royen” Kahte Hain,\n" +
                "\n" +
                "Aur Lund Aur Chut Ke Aas Paas Hote Hain To Unhe “Jhaant” Kahte Hain.","College Mein Pappu Aur Uski Ek Friend Canteen Ke Bahar Bethe Baatein Kar Rahe Thhe\n" +
                "\n" +
                "Pappu Ki Friend Ne Ahista Se Pappu Ko Bola\n" +
                "\n" +
                "Ladki: “Main Apni Zindagi Mein Koi Lamba Hath Maarna Chahti Hoon”\n" +
                "\n" +
                "Pappu Kameene Pan Se Bola: “Tum Sirf Hath Maaro Lamba Khud Hi Ho Jayega“","Pappu : Ek Manforce dena.\n" +
                "Chemist : Tum toh Sharma ji k bete ho naa ??\n" +
                "Pappu: Uncle Mentos dena, Ek do Vicks b de dena gala kharab hai . dawa ka naam bhi nahi nikal raha thik se ..","Pappu:- dad me aaj aapko ek baat batana chahta\n" +
                "hun...\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Dad:- bolo..\n" +
                ".\n" +
                ".\n" +
                "Pappu:- Dad maine Facebook pe ladkiyon ke naam\n" +
                "se 5 fake I'd banayi hain..\n" +
                ".\n" +
                "Dad:- nalayak aur kuch kaam nahi hai tere pas\n" +
                "lekin tu ye mujhe kyu bata raha hai??\n" +
                ".\n" +
                ".\n" +
                "Pappu:- dad aap jis Pinky Sharma ko ek mahine\n" +
                "se patane ki try kar rahe ho wo meri hi fake id\n" +
                "hai..","Pappu Ka Dost Uske Ghar\n" +
                "Pehli Baar Gaya..!\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Yaar Pappu, Tera Ladka\n" +
                "Ekdam Tere Jaisa\n" +
                "Dikhta Hai..!!\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Pappu: Arey Saale Dheere\n" +
                "Bol Marwayega Kya...??\n" +
                "Kaamwali Ka Ladka Hai,\n" +
                "Ghar Mein Khelne Aya\n" +
                "Hai...","Mom : beta papa ka naam bolo \n" +
                "\n" +
                "Son : Lakshman Shivaramakrishnan \n" +
                "\n" +
                "Mom : Chalo hogayi aaj ki pooja.","How To Teach A Girl Dance In Just 5 Sec?\n" +
                "\n" +
                "Simple The Best Answer Given By Pappu\n" +
                "\n" +
                "Throw A Cockroach On Her.","Ek Din School Mein Teacher Ne Pappu Se Ek Sawal Puchha?\n" +
                "\n" +
                "Teacher: “Pappu Batao, Salwar Ke Nade Ko English Mein Kya Kehte Hai?”\n" +
                "\n" +
                "Pappu: “Ji Mam, P.H.D.”\n" +
                "\n" +
                "Teacher Hairan Hokar: “Iska Kya Matlab Hai?”\n" +
                "\n" +
                "Pappu: “Ji, Payjama Holding Device.”","Papa- Beta tum shaadi kab karoge??\n" +
                "Beta- Main to shaadi diwali pe karunga!\n" +
                "Papa- Wo kyun??\n" +
                "Beta- Kya pata diwali offer me 1 ke sath 1 free mil jaaye.","Pappu Apne Baap (Santa) Ke Paas Gaya Aur Kehne Laga.\n" +
                "\n" +
                "Pappu: “Papa, Mujhe Shadi Karni Hai.”\n" +
                "\n" +
                "Santa: “Beta, Kis Se?”\n" +
                "\n" +
                "Pappu: “Dadi Se.”\n" +
                "\n" +
                "Santa Gusse Se: “Kamine, Wo Meri Maan Hai.”\n" +
                "\n" +
                "Pappu: “To Phir Aapne Meri Maan Se Shadi Kyun Ki?“","Teacher Class Mein Bachho Ko Pada Rahi Thhi\n" +
                "\n" +
                "Teacher: “Delhi Mein Kutubminaar Hai”\n" +
                "\n" +
                "Pappu Piche Wale Bench Pe So Raha Thha, Teacher Ne Ye Dekha Aur Usko Jag Ake Boli\n" +
                "\n" +
                "Teacher: “What Did I Say?”\n" +
                "\n" +
                "Pappu Hadbadate Hue: “Delhi Mey Kutta Bimar Hai“","Jab Pappu Paida Hua To Santa Doctor Se Salah Lene Gaya Ki Bacho Ki Care Kese Ki Jaye.\n" +
                "\n" +
                "Doctor: “Bache Ko Paani Dene Se Pehle Boil Kar Lena Chahiye”\n" +
                "\n" +
                "Santa: “Lekin Doctor Sahab, Boil Karne Se Bacha Marr To Nahi Jayega“","Pappu Ne Is Bar Rakshabandhan Par Apne Dosto Ke Sath Milkar Discuss Kiya.\n" +
                "\n" +
                "Pappu: “Yaar, Aaj Ke Din Koi Bhi Ladki Kisi Bhi Ladke Ko Bhai Bana Leti Hai, Aur Duniya Kuch Nahi Kahti Ulta Sab Khush Hote Hai”\n" +
                "\n" +
                "Dost: “Baat To Thik Hai, Phir?”\n" +
                "\n" +
                "Pappu: “To Problem Ye Hai Ki Karvachauth Wale Din Kisi Ko Bhi Pati Kyu Nahi Bana Sakti?”\n" +
                "\n" +
                "Hume Insaaf Chahiye…","Pappu Apne Teacher Se Puchhta Hai.\n" +
                "\n" +
                "Pappu: “Sir, Jo Kaam Maine Kiya Hi Nahi, Kya Uske Liye Mujhe Sazaa Milni Chahiye?”\n" +
                "\n" +
                "Teacher: “Bilkul Bhi Nahi.”\n" +
                "\n" +
                "Pappu: “Sir, To Maine Aaj Ka Home-Work Nahi Kiya.”","Line writtern behind a Rickshaw-\n" +
                "\n" +
                "Renault ka Baap,Nissan ka Nana\n" +
                "\n" +
                "Yeh Rickshaw chala raha hai Pappu deewana.","Interviewer: Civil engineering kyun kiya?\n" +
                "\n" +
                "Pappu : Builder banna tha.\n" +
                "\n" +
                "Interviewer: Koi bhi ek famous builder ka naam batao?\n" +
                "\n" +
                "Pappu : Bob The Builder.","*During exam*\n" +
                "Golu - \"2nd question ka answer bata na\"\n" +
                "\n" +
                "Pappu - \"Kaho na pyaar hai dekhi hai?\"\n" +
                "Golu - \"Han. 22 baar\"\n" +
                "Pappu - \"Gaana sunega?\"\n" +
                "\n" +
                "Golu - \"Han\"\n" +
                "\n" +
                "Pappu - \"Na Tum Jano Na Hum\"","Killer One:\n" +
                "\n" +
                "Pappu Mount Everest Pe gaya.\n" +
                "\n" +
                "3 Baba Baithe The\n" +
                "Aur Tambaku Ragad Rahe the.\n" +
                "\n" +
                "Pappu- Baba Ye Kya hai?\n" +
                "\n" +
                "Baba- Masala..\n" +
                "\n" +
                "Pappu- O Teri, Everest Masale Aap Banate Ho ","Dad - \"Pappu Beta uncle ke pair padh\"\n" +
                "\n" +
                "Pappu - *bows down* \"Par papa inke pair pe kuch likha hi nai hai\"","Dentist to GOLU - Apka daant nikalna padega\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "GOLU - paise lagenge?\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Dentist - 200\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "GOLU - ye lo 50 rupye thoda sa DHEELA kar do nikaal me khud lunga. . ","Pappu ne JOB ke 1st din\n" +
                "Computer pe 11 ghante\n" +
                "guzare.\n" +
                ".\n" +
                "Boss khuhsi se: Good.. Aaj kya\n" +
                "kiya ??\n" +
                ".\n" +
                ".\n" +
                "Pappu : Keyboard ki ABCD aage\n" +
                "piche lagi thi,\n" +
                "Wo sahi kar di... "

        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.PagerInPappuJokes);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(PappuJokesDetail.this,List);
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

