package com.dosoftware.utils;

import com.dosoftware.facedex.LoadingFragment;
import com.dosoftware.facedex.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class FragmentHelper {
	public static void showDetailFragment(FragmentTransaction ft, Fragment leftFrag, Fragment rightFrag, Fragment camFrag, Fragment loadFrag) {
		
		if(leftFrag != null && !leftFrag.isVisible())	{
			ft.add(R.id.leftFragment, leftFrag);
			ft.show(leftFrag);
		}
		if(rightFrag != null && !rightFrag.isVisible()) { 
			ft.add(R.id.rightFragment, rightFrag);
			ft.show(rightFrag);
		}
		if(camFrag != null && camFrag.isVisible()) 		ft.remove(camFrag);
		if(loadFrag != null && loadFrag.isVisible()) 	ft.remove(loadFrag);
	}
	
	public static void showCameraFragment(FragmentTransaction ft, Fragment leftFrag, Fragment rightFrag, Fragment camFrag, Fragment loadFrag ) {

//		if(leftFrag != null && leftFrag.isVisible()) 	ft.remove(leftFrag);
//		if(rightFrag != null && rightFrag.isVisible()) 	ft.remove(rightFrag);
//		if(camFrag != null && !camFrag.isVisible()) 	ft.add(R.id.root, camFrag);
//		if(loadFrag != null && loadFrag.isVisible()) 	ft.remove(loadFrag);
	}
	
	public static void showLoadingFragment(FragmentTransaction ft, Fragment leftFrag, Fragment rightFrag, Fragment camFrag, Fragment loadFrag) {
		
		if(leftFrag != null && leftFrag.isVisible()) 	ft.remove(leftFrag);
		if(rightFrag != null && rightFrag.isVisible()) 	ft.remove(rightFrag);
		if(camFrag != null && camFrag.isVisible()) 		ft.remove(camFrag);
		if(loadFrag != null && loadFrag.isVisible()) 	{
			ft.add(R.id.root, loadFrag);
			ft.show(loadFrag);
		}
	}
}
