package com.example.farmer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Shital Patel on 10/31/2015.
 */
public class home extends Activity{
    Button fb1;
    Button vb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        fb1= (Button)findViewById(R.id.fb1);
        vb2=(Button)findViewById(R.id.vb2);



       fb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
               // Intent i = new Intent("android.intent.action.Farmer_login");
               // startActivity(i);
                Intent i;
                i = new Intent(getBaseContext(),Farmer_login.class);
                startActivity(i);
            }
        });


        vb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i1 = new Intent("android.intent.action.login");
                //startActivity(i1);
                Intent i1 = new Intent(getBaseContext(),login.class);
                startActivity(i1);
            }
        });
    }
}

