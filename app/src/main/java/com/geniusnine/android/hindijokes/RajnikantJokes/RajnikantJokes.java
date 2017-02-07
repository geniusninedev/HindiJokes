package com.geniusnine.android.hindijokes.RajnikantJokes;

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

public class RajnikantJokes extends   AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajnikant_jokes);
        listView = (ListView) findViewById(R.id.pappujokeslistView);

        String[] values = new String[]{
               "*Phone rings*\n" +
                       "Me: Hello\n" +
                       "Rajnikant - Hello, Mein Rajnikant Bol Raha Hu \n" +
                       "Me: Pata Hai Muje.\n" +
                       "Rajnikant - Kaise ?\n" +
                       "Me : Tumne mEre Mobile pe call kiya jo abhi Switch Off hai ","Hillarious.....\n" +
                "Once Rajnikanth farted & some particles came out of his ass. Today those particles are packed & sold for Rs.10/-...\n" +
                "Its called-\"Rajni-gandha\"","Modi meets Rajinikanth.\n" +
                "Rajinikanth assures\n" +
                "him BJP will not only win in India but also in\n" +
                "America, Russia, France, China, Spain, Japan..","RaGa: Mujhe PM nahi ban na. \n" +
                "NaMo: Kyun kya hua? Darr gya? \n" +
                "RaGa: Tune choti si bat pe Rajnikanth ko kyun bula lia?","Rajanikant's mom to Rajanikant -\n" +
                "Agar tumhara khelna ho gaya ho,\n" +
                "toh bete who Malaysia ki plane lauta do,\n" +
                "puri duniya khamakha pareshaan ho rahi hain...","Ek Bar Gandhi Ji Gym Gaye, Vaha Unko Rajinikant Mila Aur Unse Bola.\n" +
                "Rajinikant: “Wah Re Bapu, Kya Body Hai!”\n" +
                "Bus Tabse, Unhone Shirt Pehenna Chod Diya","Patient: doctor I have lot of fear about my heart surgery...\n" +
                "Dr: then you go with your photograph to Rajnikant he will do surgery to your photo......","Gabbar : Kitne Aadmi the ?\n" +
                "Kalia : Sarkar 1\n" +
                "Gabbar : Aur tum ?\n" +
                "Kalia : 100\n" +
                "Gabbar : fir b wapas aa gaye woh b khali hath,\n" +
                "kaun tha woh ?\n" +
                "Kalia : RAJNIKANT.\n" +
                "Gabbar : Oops ! sorry bhai ... !!","Don ko 11 Mulko ki police Talash Rahi Hai ..\n" +
                "Isliye Don Rajnikant ke ghar me chupta hai .","*Mere baare mein wikipedia pe padh lo.*\n" +
                "Rajni Fans : That's wrong. Wikipedia reads about itself on Rajnikanth. ","Ek Admi ne 1 ungli se 8 admi ko upar pahucha diya \n" +
                "or wo rajnikant b nahi tha Batao kese?","why did obama come to india ? \n" +
                "To receive the payment of nasa's rocket he sold to RAJNIKANTH for diwali.","jini rubs rajinikant & rajnikant grants him three wishes \n" +
                "rajnikant will star in the remake of muvi '300 \n" +
                "Guess the name is?? ","rajnikant first takes a gold medal... \n" +
                "N...dn starts race ","Rajnikanth is the secret of Boost`s\n" +
                "energy;\n" +
                "and Complan is a Rajnikanth boy! ","PeopLe Update Status Via\n" +
                "BLackBerry, \n" +
                "iPhone, \n" +
                "iPad, \n" +
                "etc..'\n" +
                "\"But HuMare RajniKant Updates... ","Chennai express box office par itni hit kyo hui???\n" +
                "kyoki..........","OBAMAS SPEECH IN USA AFTER INDIA TOUR- \"Maa Kasam Sach Bol Rha Hu, Rajnikant BOMB Se Agarbatti Jalata Hai.\" Toba Toba","British India KO 1947 m kyu chod k chale gye?\n" +
                "Socho\n" +
                "Socho socho.","Spiderman, batman, shaktiman, harry potter, james bond, all gatherd at rajnikants house, \n" +
                "why?\n" +
                "Gurupurnima hai naa.","\"Barish hue bheeg gaye hum\"\n" +
                "\"Barish hue bheeg gaye hum\"\n" +
                "Fir kya","Once Rajnikanth went For\n" +
                "Morning Walk...\n" +
                "Suddenly, after 2 hours..\n" +
                "Police Arrested Him..\n" +
                "Why...??" ,"Remake of Movie Ghulam in Tamil.\n" +
                "\"Rajnikanth\" as hero..\n" +
                "Runnings towards train\n" +
                "...\n" +
                "5 meters left,","Rajnikant was playing DHOL during ganpati visarjan.\n" +
                "An alien landed on Earth & requested\n" +
                "\"Bhau Mazya Porachi Exam Ahe,Thoda Halu Vajva....","In 2010, Rajnikanth released a film named" +
                "Robot\n" +
                "The history will repeat,\n" +
                "In 3010,\n" +
                "Robots will release a film named Rajnikanth...","Toofani anderi raat mein...\n" +
                "kabristan ke andere jungle mein.." +
                "ek bhoot dusre bhoot ko samjha raha tha..\n" +
                "\"gabra mat sab beham aur afwaah hai..\n" +
                "Koi Rajnikant - Bajnikant nhi hota hai.","Mind blasting fact of\n" +
                "Rajnikant.\n" +
                "Rajnikant was born on 30 feburary..\n" +
                "Since then febrary decided not to\n" +
                "give this day\n" +
                "to anybody else.","Ram aur Raavan Bada serious yudh kar rahe the..\n" +
                "Tabhi Raavan ne Ram ke peechey kisi ko khada dekha..\n" +
                "Raavan:\" chal yaar bye..\n" +
                "Ram:\" kya hua ??\n" +
                "Raavan:\" Nahi yaar bas bye, Le sitako Leja..\n" +
                "Ram:\" Arre hua kya, Ruk to sahi..\n" +
                "Ravan:\" Nahi yaar achha I am sorry ok..\n" +
                "Ram:\" Dost nahi hai.. Bata to sahi hua kya..???","Rajinikant got 150 questions in\n" +
                "exam paper asking -\"Solve any 100\n" +
                "questions\"\n" +
                "He solved all 150 and wrote, \"\n" +
                "Rascalla!, CHECK ANY 100!\"....","Rajnikant opened a college ,but student confused ,\n" +
                "Bcoz the name of the college is . . . . . . . . .\n" +
                "'RAJNIKANT MEDICAL COLLEGE OF ENGINEERING FOR COMMERCE AND ARTS '","When rajnikant was in school , someone stole his rough book of english .\n" +
                "and" ,"Why did rajnikant wear sunglasses . . . . . . . . .\n" +
                "socho . . . socho . .","Aik din rajnikant ka 1 rupya building se niche gir gaya .\n" +
                "rajnikant niche pahucha to rupya nahi mila . \n" +
                "kyu ???????? socho . . socho . .socho","Once a TATA Company’s 22 WheelerHuge Truck Met With An Accident Against RAJINIKANTH\n" +
                "Since then..\n" +
                "its called as\n" +
                "TATA NANO.","TITANIC bahut zabardast film thi,\n" +
                "Par ek raaz jo sab ko nahi pata…\n" +
                "Wo ye hai ki..\n" +
                "Titanic ki puri shooting\n" +
                "Rajnikanth ke BATH TAB mein hui thi.","Once Rajnikant and a girl were playing cards,\n" +
                "rajnikant had (AAA) but could not win,why?\n" +
                "Becoz the girl had 3 Rajnikants…","Rajinikanth got selected in Roadies...\n" +
                "Next day during vote-out,\n" +
                "RAJINIKANTH: I'm sorry Raghu, apka Roadies ka safar yahi khatam hota hai...","samje aaye to like karna ,,naa aaye to dobaara padhna\n" +
                "BigB: How Famous u r...??\n" +
                "Rajni: whole world knows me.\n" +
                "Bigb: Obama knows u..? Gv proof.\n","Rajnikant - Aaj mere Kutte ne anda diya.\n" +
                "Big B - Kutta kab se anda dene laga?","Ek bar rajnikant ne ek cooking\n" +
                "champion me hisa liya\n" +
                "Unhe to jitna hi tha\n" +
                "Sochie rajnikant ne finale me kon\n" +
                "si diss banai hogi :-\n" +
                "Sochie\n" +
                "Lal mirchi ki mithi khir . . . .! !","Rajnikant addeD facebook as his friend.......","Unfortunately, Rajnikanth died 3 hours ago... :( :'( "
                ,"Rajnikant ne Robot film kyu\n" +
                "banayi.. ??","Rajnikant Garba ki Raat Dhol Baja raha tha..\n" +
                "Thodi der Baad ek Alien Dharati per Aaya aur Bola\n" +
                "Bhai Mere Bete ka kal Exam hai, Thoda Dheere Bajaa..."

        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_rajnikant_jokes,R.id.textViewPappu,values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RajnikantJokes.this, RajnikantJokesDetail.class);
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