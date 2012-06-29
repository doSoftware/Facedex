package com.dosoftware.utils;

import com.dosoftware.facedex.FaceRecActivity;

import android.content.Context;
import android.content.Intent;

public class IntentHelper {
	static public Intent startFaceRecActivity(Context c) {
		return new Intent(c, FaceRecActivity.class)
			.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	}

	//	static public Intent startActivityFragment(Context c) {
	//return new Intent(c, com.mgj.alib.fragment.MainActivity.class)
	//.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	//.putExtra(PoiContentActivity.COMMAND, PoiContentActivity.COMMAND_BUBBLETAP_ID)
	//.putExtra(PoiContentActivity.EXTRAS_BUBBLETAP_ID, bubbleID));
}

