package com.example.farmer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class farmer_img extends Activity {
	Button b1;
	ImageView imageView1,imageview2,imageview3,imageview4;
	   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farmer_img);
		
		imageView1=(ImageView)findViewById(R.id.imageView1);
		imageview2=(ImageView)findViewById(R.id.imageView2);
		imageview3=(ImageView)findViewById(R.id.imageView3);
		imageview4=(ImageView)findViewById(R.id.imageView4);
		b1=(Button)findViewById(R.id.b1);
		
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i =new Intent("android.action.intent.farmer_profile");
				startActivity(i);
			}
		});
		
		
		
	
	}
}

 