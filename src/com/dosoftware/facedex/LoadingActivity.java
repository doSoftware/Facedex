package com.dosoftware.facedex;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class LoadingActivity extends SherlockFragmentActivity{

	public LoadingActivity() {
	}
	
	@Override
	protected void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.loading);
	}

}
