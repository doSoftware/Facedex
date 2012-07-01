package com.dosoftware.facedex;


import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends android.support.v4.app.FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Need to check if Activity has been switched to landscape mode
		// If yes, finished and go back to the start Activity
//		if (getResources().getConfiguration().orientation == 
//				Configuration.ORIENTATION_LANDSCAPE) {
//			finish();
//			return;
//		}

		setContentView(R.layout.fragment_details);
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String s = extras.getString("value");
			TextView view = (TextView) findViewById(R.id.detailsText);
			view.setText(s);
		}
	}
}
