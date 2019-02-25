package com.example.nanocyle;

import android.content.DialogInterface;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.livefront.bridge.Bridge;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView mRecyclerView;
     MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bridge.restoreInstanceState(this, savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycler view object is created
        mRecyclerView=findViewById(R.id.recycler_view);
       mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
       // mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //linear layout is set
        myAdapter=new MyAdapter(this,getPlayers());
        mRecyclerView.setAdapter(myAdapter);
    }
    //add models to arraylist
    private ArrayList<Model> getPlayers(){
        ArrayList<Model> models=new ArrayList<>();

        Model p;

        p = new Model();
        p.setTitle("Golden package-All Events Except");
        p.setDescription("Every event starting from Monday to Saturday are free in this package-\n"+"1:");
        p.setImg(R.drawable.gold_package);
        p.setDate("Monday - Saturday:10:00-03:30pm \n");
        p.setVenue("1 Block-Seminar Hall-3rd Floor\n");
        p.setType("Paid:Rs 200/-\n");
        models.add(p);


        p = new Model();
        p.setTitle("Business Simulator");
        p.setDescription("This Event Gives You a Taste of Every Aspect involving in Business/Startups\n"+
                "How To meet Investors and How to market our Products and Increase our Market\n"+
                "A RealWorld Simulator Which gives an \n"+
                "introduction to how to kick-start, What are\n" +
                " the Problems involving in Startups\n");
        p.setImg(R.drawable.business);
        p.setDate("MonDay-1:00-2:15pm Thursday(monopoly)-10:00-12:00pm Friday(KickStarter)-10:00-12:00 Saturday(conclusion):10:00-12:00pm\n");
        p.setVenue("Block -1 Seminar-Hall 3rd Floor\n");
        p.setType("Paid:PerTeam(5 Members per Team)-150/-\n");
        models.add(p);

        p = new Model();
        p.setTitle("Enixus");
        p.setDescription("Enixus :\n" +
                "An event where people will be given the list of demolished companies and they will have to come up with strategies to resurrect their company.\n" +
                "These companies are real world companies. \n" +
                "\n" +
                "There are 2 rounds for this. \n" +
                "The first round, people can make groups of 2/3 and can create their strategy. \n" +
                "In round 2 they will have to come up with their strategy solely.");
        p.setImg(R.drawable.enixus);
        p.setDate("Monday-2:15-3:45pm\n");
        p.setVenue("Block -1 Seminar-Hall 3rd Floor\n");
        p.setType("Paid :Rs 50/-\n");
        models.add(p);

        p = new Model();
        p.setTitle("Code_blind");
        p.setDescription("The event is to make the participants type the code when the screen is covered with a black sheet."
                +"The codes v give will be easy enough for doing.\n "
                +" The one who types first and executes it correctly will be the winner. contact Rachna:7702331507\"");
        p.setImg(R.drawable.codeblind);
        p.setDate("TuesDay\t Wednesday\n Timings:10:00-12:00am\n");
        p.setVenue("E-Class 2");
        p.setType("Paid:Rs 50/-\n");
        models.add(p);

        p = new Model();
        p.setTitle("Pseudo_Debate");
        p.setDescription("You wil Have a unique environment in this event where you are given the topic and you need to debate on that topic Contact:Sritam:8187057024\n");
        p.setImg(R.drawable.pseudodebate);
        p.setDate("Tuesday :after lunch:1:00-2:15 pm");
        p.setVenue("3rd floor Seminar-Hall Block-1");
        p.setType("Paid :Rs 50/-\n");
        models.add(p);



        p = new Model();
        p.setTitle("Anecdote");
        p.setDescription("This event is a fun Based event where you will get a lot of exposure...so if you want experience with fun then head towards Block-3 Seminar-Hall");
        p.setImg(R.drawable.anecdote);
        p.setDate("27 february-Wednesday:1:00-3:45pm contact:Rehman:8142746573");
        p.setVenue("Block 1 Seminar-Hall 3rd floor");
        p.setType("Paid:50/-");
        models.add(p);

        p = new Model();
        p.setTitle("Openmic");
        p.setDescription("This is the one and only one platform to showcase your skills\n" +
                " in this event you can do anything like \n" +
                "Music\n" +
                "Poetry\n"+
                "Comedy\n"+"So let's Have Some Rocking Fun with EveryOne\n"+
                "Contact Saiteja:7093144365\n" +
                "-in Collaboration with StuMagz\n"
        );
        p.setImg(R.drawable.openmic);
        p.setDate("Thursday:1:00-3:45pm");
        p.setVenue("Block-1 Seminar-Hall 3rd floor");
        p.setType("Free Event Anyone Can Participate");
        models.add(p);


        p = new Model();
        p.setTitle("Slippery FootBall/DodgeBall");
        p.setDescription("Dates : 26th Feb onwards\n" +
                "Charges : 200/- per team \n" +
                "Coordinators :\n" +
                "Harshita Sanjay :8309505544\n" +
                "Sarang Nyalkalkar \n" +
                "Aditya \n" +
                "\n" +
                "Description : \n" +
                "This is a fun event where participants will have to come in teams of 4. They'll be provided with raincoats and socks. 2 teams will then play football on a soapy platform, within a time span of 10-15 mins."+"The one with max goals will be the winner."+" The same would be followed for Dodge Ball as well");
        p.setImg(R.drawable.football);
        p.setDate("Tuesday onwards\n");
        p.setVenue("College FootBall Ground \n ");
        p.setType("Paid: Per Team :Rs200/-\n");
        models.add(p);

        p = new Model();
        p.setTitle("Logic Investor");
        p.setDescription("Bid For Celebrities,Bribe the Officials with Virtual Cash And a lot More Contact:praneeth:9652305099");
        p.setImg(R.drawable.logicinvestor);
        p.setDate("Friday:1-Mar-2019:1:00-3:45pm");
        p.setVenue("Block 1 Seminar-Hall");
        p.setType("Paid :Per Team - Rs100/-");
        models.add(p);

        p = new Model();
        p.setTitle("Mad Ads");
        p.setDescription(" " +
                "Contact :Roshan 8919275028");
        p.setImg(R.drawable.madads);
        p.setDate("Saturday:1:00-2:15 pm");
        p.setVenue("Block 3 Seminar-Hall 3rd floor");
        p.setType("Paid :Rs 50/-\n");
        models.add(p);



        p = new Model();
        p.setTitle("Form up on me");
        p.setDescription("This is completely a gaming event ..are you the Conqueror of Gcet then play PUBG gaming event and prove it.... you will get exciting prize money if you get Chicken Dinner");
        p.setImg(R.drawable.formuponme);
        p.setDate("25-FEB-02-MAR");
        p.setVenue("Contact Charan for Venue:8121964088");
        p.setType("paid:Team:Rs 100/-\n Single-person:Rs 50/-\n");
        models.add(p);


        p = new Model();
        p.setTitle("Neon_Cricket");
        p.setDescription("Neon cricket: \n" +
                "For all the cricket-besotted folks, we come up with the most exciting and the most awaited event : Neon Cricket \n" +
                "\n" +
                "Get ready to face the challenges when you will not be able to see the fielders, bowlers and batsman. \n" +
                "Experience the last ball pressure and the one run victories. Shine in the dark moments for your team.\n" +
                "\n" +
                "Do you think, you've got what it takes to win this? Then come take part in the exuberance to win amazing prizes worth your performance and overpower darkness with your light.");
        p.setImg(R.drawable.neoncricket);
        p.setDate("Every Day From 26 February(Tuesday) upto 2nd March--2:00-3:30pm");
        p.setVenue("Block-1 Seminar-Hall ");
        p.setType("paid: Price per Team is :Rs 250/-\n"+
                "Team: min 3 members\n"+
                "Max:5 members\n");
        models.add(p);


        p = new Model();
        p.setTitle("Hookedup");
        p.setDescription("In this Event You will be tied up with your partner in a Dark room And you Should get out of the room by finding out the key.. This is a crazy event where you will get a unique experience.. \n");
        p.setImg(R.drawable.hookedup);
        p.setDate("contact co-ordinator Nainaka\n");
        p.setVenue("Block-3 Seminar Hall\n");
        p.setType("Paid-Rs50/-");
        models.add(p);

        p = new Model();
        p.setTitle("LAN-GAMING");
        p.setDescription("This is a gaming event.. where you can play\n"+" 1:NFS\n"+" 2:CounterStrike Go\n");
        p.setImg(R.drawable.langaming);
        p.setDate("Daily After Lunch 2:00-3:45pm\n");
        p.setVenue("E Class 2-Second Floor Block 1");
        p.setType("Paid: Squad-Rs100/- Solo-Rs50/-");
        models.add(p);


        p = new Model();
        p.setTitle("MemeReview");
        p.setDescription("Round 1:Memes on Any Topic\n round 2:Memes Related to Technology and Academics Check portal for Further Details");
        p.setImg(R.drawable.memereview);
        p.setDate("Check portal for Updates and how to signup for it..");
        p.setVenue("Online Event");
        p.setType("free any one can participate");
        models.add(p);

        p = new Model();
        p.setTitle("Poets_tale");
        p.setDescription("Here you need to write poem from the perspective of the writer...Check portal for details");
        p.setImg(R.drawable.poetstale);
        p.setDate("check portal");
        p.setVenue("Online Event");
        p.setType("free any one can participate");
        models.add(p);



        p = new Model();
        p.setTitle("Stock Market");
        p.setDescription("Stock market:\n" +
                "->It is a place where shares of public listed companies are traded.\n" +
                " \n" +
                "->where one investor buys shares from companies at the prevailing market price.\n"+
                "Let's Have A Crazy Time over There so come on Join us in Stock Market\n"+
                "--->Contact:Indrajith:8919818499\n");
        p.setImg(R.drawable.stockmarket);
        p.setDate("Contact-indrajith");
        p.setVenue("Online Event");
        p.setType("Paid:Rs-100/-");
        models.add(p);


        return models;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                myAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //called whenever you type each lettee in searchview
                myAdapter.getFilter().filter(newText);
                return false;
            }

        });

        return true;
    }


    //this is useful for whether the selected one is settings or not...
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_sort){
          showSortDialog();
        return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showSortDialog() {
    String options[]={"Paid","Free","Day"};
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Sort By");
        builder.setIcon(R.drawable.ic_action_sort);
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 if(which==0){//paid

                 }
                 if(which==1){//free

                 }
                 if(which==2){//day

                 }
            }
        });
    }
}


//now i need to add the module which will make my app to respond for the touches or clicks....
//so i create a interface and i will call them according to that...