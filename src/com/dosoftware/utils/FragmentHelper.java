package com.dosoftware.utils;

import com.dosoftware.facedex.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class FragmentHelper {
	public static void showDetailFragment(FragmentTransaction ft, Fragment leftFrag, Fragment rightFrag, Fragment camFrag) {
		if(leftFrag != null &&  rightFrag != null && (!leftFrag.isVisible() || !rightFrag.isVisible()) ) {
			ft.replace(R.id.leftFragment, leftFrag);
		}
		
		if(camFrag != null && camFrag.isVisible()) ft.remove(camFrag);
	}
	
	public static void showCameraFragment(FragmentTransaction ft, Fragment leftFrag, Fragment rightFrag, Fragment camFrag) {

		if(leftFrag != null && leftFrag.isVisible()) ft.remove(leftFrag);
		if(rightFrag != null && rightFrag.isVisible()) ft.remove(rightFrag);
		if(camFrag != null && !camFrag.isVisible()) ft.add(R.id.root, camFrag);
	}
}
