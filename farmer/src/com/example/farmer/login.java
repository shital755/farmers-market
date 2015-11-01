package com.example.farmer;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends Activity {
    EditText l_username,l_password;

    Button l_login,l_reg;
    Button fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        l_username = (EditText)findViewById(R.id.l_username);
        l_password = (EditText)findViewById(R.id.l_password);


        l_login = (Button)findViewById(R.id.l_login);
        l_reg = (Button)findViewById(R.id.l_reg);
        fg = (Button)findViewById(R.id.Fpass);


        l_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub



            }
        });

        fg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                AlertDialog.Builder a =new AlertDialog.Builder(login.this);
                a.setTitle("Enter Userid");
                final EditText input = new EditText(login.this);
                a.setView(input);
                a.setPositiveButton("ok",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
			/*	String to = "yaminitailor6811@gmail.com";
				  String subject = "dont forget ur password";
				  String message = "Account is deleted";

				  Intent email = new Intent(Intent.ACTION_SEND);
				  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
				  email.putExtra(Intent.EXTRA_SUBJECT, subject);
				  email.putExtra(Intent.EXTRA_TEXT, message);

				  //need this to prompts email client only
				  email.setType("message/rfc822");

				  startActivity(Intent.createChooser(email, "Choose an Email client :")); */

                        Toast.makeText(login.this,"mail sent",Toast.LENGTH_SHORT).show();
                    }
                });
                a.setNegativeButton("cancel",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                } );
                a.setIcon(android.R.drawable.ic_dialog_alert);
                a.show();

            }
        });

        l_reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent("android.intent.action.register");
                startActivity(i);
            }
        });


    }


}







