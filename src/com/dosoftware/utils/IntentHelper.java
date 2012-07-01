package com.dosoftware.utils;


import com.dosoftware.facedex.DetailActivity;

import android.content.Context;
import android.content.Intent;

public class IntentHelper {
	public static Intent startActivityFragmentDetail(Context c, String item) {
		return new Intent(c, DetailActivity.class)
			.putExtra("value", item)
			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	}
//	static public Intent startFaceRecActivity(Context c) {
//		return new Intent(c, FaceRecActivity.class)
//		.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//	}
	
//	public static Intent startActivityFragmentDetail(Context c, String item) {
//		return new Intent(c, DetailActivity.class)
//			.putExtra("value", item)
//			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//	}
}

