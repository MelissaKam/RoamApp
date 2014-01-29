package com.example.roamingapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.Toast;

@SuppressLint("NewApi") public class MainActivity extends Activity {
	private Switch mySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        mySwitch = (Switch) findViewById(R.id.mySwitch);
        
        mySwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            	
            	if (isChecked) {

            		Toast.makeText(getApplicationContext(), "Device is ON",
            		Toast.LENGTH_SHORT).show();

            		} else {

            		Toast.makeText(getApplicationContext(),
            		"Device is OFF", Toast.LENGTH_SHORT).show();
            		}
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
        
}