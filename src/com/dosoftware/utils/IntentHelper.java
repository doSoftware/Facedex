package com.dosoftware.utils;


import com.dosoftware.facedex.DetailActivity;
import com.dosoftware.facedex.LoadingActivity;
import com.dosoftware.facedex.MainActivity;

import android.content.Context;
import android.content.Intent;

public class IntentHelper {
	public static Intent startActivityFragmentDetail(Context c, String item) {
		return new Intent(c, DetailActivity.class)
			.putExtra("value", item)
			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	}
	
	public static Intent startActivityMain(Context c) {
		return new Intent(c, MainActivity.class)
			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	}
//	static public Intent startFaceRecActivity(Context c) {
//		return new Intent(c, FaceRecActivity.class)
//		.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//	}

	public static Intent startActivityLoading(Context c) {
		return new Intent(c, LoadingActivity.class)
		.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	}
	
//	public static Intent startActivityFragmentDetail(Context c, String item) {
//		return new Intent(c, DetailActivity.class)
//			.putExtra("value", item)
//			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//	}
}

