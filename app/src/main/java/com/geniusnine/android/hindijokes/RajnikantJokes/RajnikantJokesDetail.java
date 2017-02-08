package com.geniusnine.android.hindijokes.RajnikantJokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.hindijokes.R;
import com.geniusnine.android.hindijokes.jokes.ViewPagerAdapter;

public class RajnikantJokesDetail  extends AppCompatActivity{
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajnikant_jokes_detail);
        List = new String[] {
"*Phone rings*\n" +
        "Me: Hello\n" +
        "Rajnikant - Hello, Mein Rajnikant Bol Raha Hu \n" +
        "Me: Pata Hai Muje.\n" +
        "Rajnikant - Kaise ?\n" +
        "Me : Tumne mEre Mobile pe call kiya jo abhi Switch Off hai ","Hillarious.....\n" +
                "\n" +
                "Once Rajnikanth farted & some particles came out of his ass. Today those particles are packed & sold for Rs.10/-...\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "\n" +
                "Its called-\"Rajni-gandha\"","Modi meets Rajinikanth.\n" +
                "\n" +
                "Rajinikanth assures\n" +
                "him BJP will not only win in India but also in\n" +
                "America, Russia, France, China, Spain, Japan..","RaGa: Mujhe PM nahi ban na. \n" +
                "\n" +
                "NaMo: Kyun kya hua? Darr gya? \n" +
                "\n" +
                "RaGa: Tune choti si bat pe Rajnikanth ko kyun bula lia?","Rajanikant's mom to Rajanikant -\n" +
                "Agar tumhara khelna ho gaya ho,\n" +
                "toh bete who Malaysia ki plane lauta do,\n" +
                "?\n" +
                "?\n" +
                "?\n" +
                "?\n" +
                "?\n" +
                "puri duniya khamakha pareshaan ho rahi hain...","Ek Bar Gandhi Ji Gym Gaye, Vaha Unko Rajinikant Mila Aur Unse Bola.\n" +
                "\n" +
                "Rajinikant: “Wah Re Bapu, Kya Body Hai!”\n" +
                "\n" +
                "Bus Tabse, Unhone Shirt Pehenna Chod Diya","Patient: doctor I have lot of fear about my heart surgery...\n" +
                "\n" +
                "Dr: then you go with your photograph to Rajnikant he will do surgery to your photo......","Gabbar : Kitne Aadmi the ?\n" +
                "Kalia : Sarkar 1\n" +
                "Gabbar : Aur tum ?\n" +
                "Kalia : 100\n" +
                "Gabbar : fir b wapas aa gaye woh b khali hath,\n" +
                "kaun tha woh ?\n" +
                ".\n" +
                "Kalia : RAJNIKANT.\n" +
                "Gabbar : Oops ! sorry bhai ... !!","Don ko 11 Mulko ki police Talash Rahi Hai ..\n" +
                "Isliye Don Rajnikant ke ghar me chupta hai .","*Mere baare mein wikipedia pe padh lo.*\n" +
                "Rajni Fans : That's wrong. Wikipedia reads about itself on Rajnikanth. ","Ek Admi ne 1 ungli se 8 admi ko upar pahucha diya \n" +
                ".\n" +
                ".\n" +
                "or wo rajnikant b nahi tha Batao kese?\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Lift se yaar Q Apna kamjor dimag par jor dete ho. . ","why did obama come to india ? \n" +
                ". \n" +
                ". \n" +
                ". \n" +
                ". \n" +
                "To receive the payment of nasa's rocket he sold to RAJNIKANTH for diwali.","jini rubs rajinikant & rajnikant grants him three wishes \n" +
                "rajnikant will star in the remake of muvi '300 \n" +
                "Guess the name is?? \n" +
                "\n" +
                "'1'","rajnikant first takes a gold medal... \n" +
                "N...dn starts race ","Rajnikanth is the secret of Boost`s\n" +
                "energy;\n" +
                "and Complan is a Rajnikanth boy! ","PeopLe Update Status Via\n" +
                "BLackBerry, \n" +
                "iPhone, \n" +
                "iPad, \n" +
                "etc..'\n" +
                ".\n" +
                ".\n" +
                "\"But HuMare RajniKant Updates... \n" +
                ".\n" +
                ".\n" +
                "Status Via CaLCuLator\" \"\n" +
                "\n" +
                "''RoBo''\n" +
                "Rocks\".","Chennai express box office par itni hit kyo hui???\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "kyoki\n" +
                ".\n" +
                ".\n" +
                "Uske ek song me Rajnikant k poster lge huye h n\n" +
                "don't anderastimate the power of\n" +
                "RAJNIKANT..","OBAMAS SPEECH IN USA AFTER INDIA TOUR- \"Maa Kasam Sach Bol Rha Hu, Rajnikant BOMB Se Agarbatti Jalata Hai.\" Toba Toba"
,"British India KO 1947 m kyu chod k chale gye?\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Socho\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Socho socho.\n" +
                ".\n" +
                "..\n" +
                ".\n" +
                "Thoda or\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Kyu ki 1948 m Rajnikant paida hua tha.\n" +
                "Mind it...","Spiderman, batman, shaktiman, harry potter, james bond, all gatherd at rajnikants house, \n" +
                "\n" +
                "why?\n" +
                "\n" +
                "Gurupurnima hai naa.","\"Barish hue bheeg gaye hum\"\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "\"Barish hue bheeg gaye hum\"\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Fir kya\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ",\n" +
                "\"Rajnikanth ne phuk maari sukh gaye hum\"!.","Once Rajnikanth went For\n" +
                ".\n" +
                ".\n" +
                "Morning Walk...\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Suddenly, after 2 hours..\n" +
                ".\n" +
                ".\n" +
                "Police Arrested Him..\n" +
                ".\n" +
                "Why...??\n" +
                ".\n" +
                ".\n" +
                "Bcoz..\n" +
                ".\n" +
                "He reached America without Visa..\n" +
                "passport...\n" +
                "Yana Rasclla Mind It ","Remake of Movie Ghulam in Tamil.\n" +
                "\n" +
                "\"Rajnikanth\" as hero..\n" +
                "\n" +
                "Runnings towards train\n" +
                "...\n" +
                "5 meters left,\n" +
                "\n" +
                "4m.\n" +
                "\n" +
                "3m.\n" +
                "\n" +
                "2m.\n" +
                "\n" +
                "1m.\n" +
                "\n" +
                "TRAIN jumps on the other track! \n" +
                "Yanna rascala! Mind it! ","Rajnikant was playing DHOL during ganpati visarjan.\n" +
                "An alien landed on Earth & requested\n" +
                "\"Bhau Mazya Porachi Exam Ahe,Thoda Halu Vajva....","In 2010, Rajnikanth released a film named\n" +
                "Robot\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "The history will repeat,\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "In 3010,\n" +
                "Robots will release a film named Rajnikanth...","Toofani anderi raat mein...\n" +
                "\n" +
                "kabristan ke andere jungle mein..\n" +
                "ek bhoot dusre bhoot ko samjha raha tha..\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "\"gabra mat sab beham aur afwaah hai..\n" +
                "Koi Rajnikant - Bajnikant nhi hota hai.","Mind blasting fact of\n" +
                "Rajnikant.\n" +
                "Rajnikant was born on 30 feburary..\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Since then febrary decided not to\n" +
                "give this day\n" +
                "to anybody else.","Ram aur Raavan Bada serious yudh kar rahe the..\n" +
                "Tabhi Raavan ne Ram ke peechey kisi ko khada dekha..\n" +
                ".\n" +
                ".\n" +
                "Raavan:\" chal yaar bye..\n" +
                "Ram:\" kya hua ??\n" +
                "Raavan:\" Nahi yaar bas bye, Le sitako Leja..\n" +
                "Ram:\" Arre hua kya, Ruk to sahi..\n" +
                ".\n" +
                "Ravan:\" Nahi yaar achha I am sorry ok..\n" +
                "Ram:\" Dost nahi hai.. Bata to sahi hua kya..???\n" +
                ".\n" +
                ".\n" +
                "Ravan:\" Kuch nahi bhai baat hi khatam, no tension, no fikar, maje-maje..\n" +
                "Ram:\" Nahi pehle bata pleeez, tujhe meri kasam, kya hua???\n" +
                ".\n" +
                "Ravaan:\" Bas rehne de yaar, itni si baat pe tune" +
                "Rajnikant ko bula liya...","Rajinikant got 150 questions in\n" +
                "exam paper asking -\"Solve any 100\n" +
                "questions\"\n" +
                "He solved all 150 and wrote, \"\n" +
                "Rascalla!, CHECK ANY 100!\"...."
,"Rajnikant opened a college ,but student confused ,\n" +
                "Bcoz the name of the college is . . . . . . . . .\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ". \n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "'RAJNIKANT MEDICAL COLLEGE OF ENGINEERING FOR COMMERCE AND ARTS '","When rajnikant was in school , someone stole his rough book of english .\n" +
                "and\n" +
                "\n" +
                "now \n" +
                "that book is known as 'OXFORD DICTIONARY'","Why did rajnikant wear sunglasses . . . . . . . . .\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "socho . . . socho . .\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "to protect sun from his eyes","Aik din rajnikant ka 1 rupya building se niche gir gaya .\n" +
                "\n" +
                "rajnikant niche pahucha to rupya nahi mila . \n" +
                "kyu ???????? socho . . socho . .socho\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "kyuki rajnikant rupya girne se pehle hi pohoch gaya . . \n","Once a TATA Company’s 22 WheelerHuge Truck Met With An Accident Against RAJINIKANTH\n" +
                ".\n" +
                ".\n" +
                "Since then..\n" +
                "its called as\n" +
                "TATA NANO.","TITANIC bahut zabardast film thi,\n" +
                "Par ek raaz jo sab ko nahi pata…\n" +
                "Wo ye hai ki..\n" +
                "Titanic ki puri shooting\n" +
                "Rajnikanth ke BATH TAB mein hui thi.","Once Rajnikant and a girl were playing cards,\n" +
                "rajnikant had (AAA) but could not win,why?\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Becoz the girl had 3 Rajnikants…","Rajinikanth got selected in Roadies...\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Next day during vote-out,\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "RAJINIKANTH: I'm sorry Raghu, apka Roadies ka safar yahi khatam hota hai...","samje aaye to like karna ,,naa aaye to dobaara padhna\n" +
                "\n" +
                "BigB: How Famous u r...??\n" +
                "\n" +
                "Rajni: whole world knows me.\n" +
                "\n" +
                "Bigb: Obama knows u..? Gv proof.\n" +
                "\n" +
                "Toh, Rajni & BigB go for Obama's house.\n" +
                "\n" +
                "Rajni: stand here at the gate, i'll take obama on balcony nd show u.\n" +
                "\n" +
                "Bigb: ok.\n" +
                "\n" +
                "Rajni comes wth Obama nd show Bigb 4rm balcony.\n" +
                "\n" +
                "Aftr sometime, Rajni bahar aya toh dkha, bigb behosh ho gaya, hosh me aya toh Rajni ne reason pu6a..\n" +
                "\n" +
                "Bigb: Ek american bhikhari aya tha, nd asked me, 'WHO IS THAT MAN WITH RAJNIKANTH ON BALCONY...?'",
                "Rajnikant - Aaj mere Kutte ne anda diya.\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Big B - Kutta kab se anda dene laga?\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Rajnikant - Ye Rajni ka style hai.\n" +
                "Maine apni murgi ka naam kutta rakha hai.....","Ek bar rajnikant ne ek cooking\n" +
                "champion me hisa liya\n" +
                ".\n" +
                "Unhe to jitna hi tha\n" +
                ".\n" +
                "Sochie rajnikant ne finale me kon\n" +
                "si diss banai hogi :-\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Sochie\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Lal mirchi ki mithi khir . . . .! !","Rajnikant addeD facebook as his friend......!!!","Unfortunately, Rajnikanth died 3 hours ago... :( :'( \n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "But nw he is fine!!!...","Rajnikant ne Robot film kyu\n" +
                "banayi.. ??\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Kyuki wo dikhana chahta tha ke\n" +
                "aurat sirf aadmi ka hi nahi,\n" +
                "\n" +
                "machine ka bhi dimag kharab kar\n" +
                "sakti hai...","Rajnikant Garba ki Raat Dhol Baja raha tha..\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Thodi der Baad ek Alien Dharati per Aaya aur Bola\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Bhai Mere Bete ka kal Exam hai, Thoda Dheere Bajaa..."

        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.PagerInRajniJokes);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RajnikantJokesDetail.this,List);
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

