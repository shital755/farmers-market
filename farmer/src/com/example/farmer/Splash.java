package com.example.farmer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;



/**
 * Created by Shital Patel on 10/31/2015.
 */

public class Splash extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

// METHOD 1

        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run()
            {


                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    // After 5 seconds redirect to another intent
                    Intent i;
                    i = new Intent(getBaseContext(),home.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e)
                {

                }
            }
        };



        // start thread
        background.start();
    }
}
