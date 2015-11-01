package com.example.farmer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class Farmer_login extends Activity {

   TelephonyManager tel;
    TextView imei;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer_login);

       tel = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

       imei = (TextView) findViewById(R.id.textView2);
       imei.setText(tel.getDeviceId().toString());
    }
}
