package com.example.farmer;

/**
 * Created by Shital Patel on 11/1/2015.
 */
import java.util.regex.Pattern;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class register extends Activity {


    EditText name,email,confirm_password,password,username ;
    Button btn_ok,btn_back;

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        final Pattern EMAIL_PATTERN = Pattern
                .compile("[a-zA-Z0-9+._%-+]{1,100}" + "@"
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,10}" + "(" + "."
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,20}"+
                        ")+");
        final Pattern USERNAME_PATTERN = Pattern
                .compile("[a-zA-Z0-9]{1,250}");
        final Pattern PASSWORD_PATTERN = Pattern
                .compile("[a-zA-Z0-9+_.]{4,16}");
        radioSexGroup = (RadioGroup) findViewById(R.id.radio);


        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        password= (EditText)findViewById(R.id.password);
        username= (EditText)findViewById(R.id.username);
        confirm_password = (EditText)findViewById(R.id.cpassword);
        btn_ok = (Button)findViewById(R.id.btn_ok);
        btn_back = (Button)findViewById(R.id.btn_back);


        btn_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                radioSexButton = (RadioButton) findViewById(selectedId);



                String username1 = username.getText().toString();
                String password1 = password.getText().toString();
                String email1 = email.getText().toString();
                if (username1.equals("") || password1.equals("")
                        || email1.equals("")) {
                    if (username1.equals("")) {
                        Toast.makeText(register.this, "ENTER USERNAME",
                                Toast.LENGTH_LONG).show();

                    }
                    else if (password1.equals("")) {
                        Toast.makeText(register.this, "ENTER PASSWORD",
                                Toast.LENGTH_LONG).show();

                    }
                    else if (email1.equals("")) {
                        Toast.makeText(register.this, "ENTER EMAIL ID",
                                Toast.LENGTH_LONG).show();

                    }
                } else {
                    if (!CheckUsername(username1)) {
                        Toast.makeText(register.this, "ENTER VALID USERNAME",
                                Toast.LENGTH_LONG).show();
                    }
                    else if (!CheckPassword(password1)) {
                        Toast.makeText(register.this, "ENTER VALID PASSWORD",
                                Toast.LENGTH_LONG).show();
                    }
                    else if (!CheckEmail(email1)) {
                        Toast.makeText(register.this, "ENTER VALID EMAIL ID",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {


                    }
                }

            }

            private boolean CheckEmail(String email) {

                return EMAIL_PATTERN.matcher(email).matches();
            }

            private boolean CheckPassword(String password) {

                return PASSWORD_PATTERN.matcher(password).matches();
            }

            private boolean CheckUsername(String username) {

                return USERNAME_PATTERN.matcher(username).matches();
            }


        });









        btn_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i= new Intent("android.intent.action.login");
                startActivity(i);


                finish();
            }
        });
    }

}



