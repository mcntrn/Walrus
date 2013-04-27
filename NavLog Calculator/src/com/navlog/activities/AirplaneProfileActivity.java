package com.navlog.activities;

import com.example.navlog.calculator.R;
import com.example.navlog.calculator.R.layout;
import com.example.navlog.calculator.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AirplaneProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_airplane_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.airplane_profile, menu);
		return true;
	}
	
	public void createPerformanceParameter(View view)
	{
    	Intent intent = new Intent(this, CruisePerformanceActivity.class);
    	startActivity(intent);
	}

}
