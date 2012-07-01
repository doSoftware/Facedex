package com.dosoftware.facedex;


import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.nineoldandroids.animation.ObjectAnimator;


public class MainActivity extends SherlockFragmentActivity implements ActionBar.TabListener {

	private final Handler handler = new Handler();
	private Fragment leftFrag;
	private Fragment rightFrag;
	private boolean useLogo = false;
	private boolean showHomeUp = false;
	private String[] tabs;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final ActionBar ab = getSupportActionBar();

		// set up tabs nav
		Resources res = getResources();
		tabs = res.getStringArray(R.array.tabs);
		for(String t : tabs) {
			ab.addTab(ab.newTab().setText(t).setTabListener(this));
		}        
		// default to tab navigation
		showTabsNav();
		leftFrag = new RecentImageListFragment();
		rightFrag = new DetailFragment();
		
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.leftFragment, leftFrag);
		ft.replace(R.id.rightFragment, rightFrag);
		ft.commit();
		
//		leftFrag = 		(Fragment) getSupportFragmentManager()
//				.findFragmentById(R.id.leftFragment);
//		rightFrag = 	(Fragment) getSupportFragmentManager()
//				.findFragmentById(R.id.rightFragment);

		//    
		//		//    // create a couple of simple fragments as placeholders
		//		final int MARGIN = 16;
		//		leftFrag = new CameraFragment(getResources().getColor(
		//				R.color.android_green), 1f, MARGIN, MARGIN / 2, MARGIN, MARGIN);
		//		rightFrag = new CameraFragment(getResources().getColor(
		//				R.color.honeycombish_blue), 2f, MARGIN / 2, MARGIN, MARGIN,
		//				MARGIN);
		//FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		//ft.setCustomAnimations(R.anim.rotate, R.anim.rotate);
		//		ft.replace(arg0, arg1)
		//        ft.add(R.id.listFragment, leftFrag);
		//        ft.add(R.id.detailFragment, rightFrag);
		// ft.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main_menu, menu);

		// set up a listener for the refresh item
		//        final MenuItem refresh = (MenuItem) menu.findItem(R.id.menu_refresh);
		//        refresh.setOnMenuItemClickListener(new OnMenuItemClickListener() {
		//            // on selecting show progress spinner for 1s
		//            public boolean onMenuItemClick(MenuItem item) {
		//                // item.setActionView(R.layout.progress_action);
		//                handler.postDelayed(new Runnable() {
		//                    public void run() {
		//                        refresh.setActionView(null);
		//                    }
		//                }, 1000);
		//                return false;
		//            }
		//        });
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		//		case android.R.id.home:
		//			// TODO handle clicking the app icon/logo
		//			return false;
		//			//        case R.id.menu_refresh:
		//			//            // switch to a progress animation
		//			//            item.setActionView(R.layout.indeterminate_progress_action);
		//			//            return true;
		//			//        case R.id.menu_both:
		//			//            // rotation animation of green fragment
		//			//            rotateLeftFrag();
		//			//            return true;
//				case R.id.menu_text:
//					// alpha animation of blue fragment
//					ObjectAnimator alpha = ObjectAnimator.ofFloat(rightFrag.getView(),
//							"alpha", 1f, 0f);
//					alpha.setRepeatMode(ObjectAnimator.REVERSE);
//					alpha.setRepeatCount(1);
//					alpha.setDuration(800);
//					alpha.start();
//					return true;
//				case R.id.menu_logo:
//					useLogo = !useLogo;
//					item.setChecked(useLogo);
//					getSupportActionBar().setDisplayUseLogoEnabled(useLogo);
//					return true;
//				case R.id.menu_up:
//					showHomeUp = !showHomeUp;
//					item.setChecked(showHomeUp);
//					getSupportActionBar().setDisplayHomeAsUpEnabled(showHomeUp);
//					return true;
		//        case R.id.menu_nav_tabs:
		//            item.setChecked(true);
		//            showTabsNav();
		//            return true;
		//        case R.id.menu_nav_label:
		//            item.setChecked(true);
		//            showStandardNav();
		//            return true;
		//        case R.id.menu_nav_drop_down:
		//            item.setChecked(true);
		//            showDropDownNav();
		//            return true;
		//		case R.id.menu_bak_none:
		//			item.setChecked(true);
		//			getSupportActionBar().setBackgroundDrawable(null);
		//			return true;
		//		case R.id.menu_bak_gradient:
		//			item.setChecked(true);
		//			//getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.ad_action_bar_gradient_bak));
		//			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	//	private void rotateRightFrag() {
	//		if (rightFrag != null) {
	//			//rightFrag.getView().animate()
	//			AnimatorSet set = new AnimatorSet();
	//			set.playTogether(
	////			    ObjectAnimator.ofFloat(myView, "rotationX", 0, 360),
	////			    ObjectAnimator.ofFloat(rightFrag.getView(), "rotationY", 0, 180)
	////			    ObjectAnimator.ofFloat(myView, "rotation", 0, -90),
	//			    ObjectAnimator.ofFloat(rightFrag.getView(), "translationX", 0, 90000)
	////			    ObjectAnimator.ofFloat(myView, "translationY", 0, 90),
	////			    ObjectAnimator.ofFloat(rightFrag.getView(), "scaleX", 1, 0f),
	////			    ObjectAnimator.ofFloat(rightFrag.getView(), "scaleY", 1, 0f),
	////			    ObjectAnimator.ofFloat(rightFrag.getView(), "alpha", 1, 0.25f, 1)
	//			);
	//			set.setDuration(5 * 100).start();
	////			ObjectAnimator.ofFloat(rightFrag.getView(), "alpha", 0f)
	////			.setDuration(500).start();
	//		}
	//	}

	private void showStandardNav() {
		ActionBar ab = getSupportActionBar();
		if (ab.getNavigationMode() != ActionBar.NAVIGATION_MODE_STANDARD) {
			ab.setDisplayShowTitleEnabled(true);
			ab.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		}
	}

	private void showDropDownNav() {
		ActionBar ab = getSupportActionBar();
		if (ab.getNavigationMode() != ActionBar.NAVIGATION_MODE_LIST) {
			ab.setDisplayShowTitleEnabled(false);
			ab.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		}
	}

	private void showTabsNav() {
		ActionBar ab = getSupportActionBar();
		if (ab.getNavigationMode() != ActionBar.NAVIGATION_MODE_TABS) {
			ab.setDisplayShowTitleEnabled(false);
			ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		}
	}

	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
		switch(tab.getPosition()) {
		// Details
		case 0:
//			ft.remove(leftFrag);
//			ft.remove(rightFrag);
			leftFrag = new RecentImageListFragment();
			rightFrag = new DetailFragment();
			ft.replace(R.id.leftFragment, leftFrag);
			ft.replace(R.id.rightFragment, rightFrag);
			//ft.commit();
			break;
		// Camera
		case 1: break;
		}
		int lolol = 5+5+5+5;
		// FIXME add a proper implementation, for now just rotate the left
		// fragment
		//rotateRightFrag();
		//		ft.add(R.id.detailFragment, new CameraFragment(getResources().getColor(
		//                R.color.android_green), 1f, 0, 0, 0, 0));
		//ft.commit();
		lolol++;
	}

	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
		// FIXME implement this
	}

	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
		// FIXME implement this
	}

}
//	private CameraFragment leftFrag;
//	private CameraFragment rightFrag;
//
//	@Override
//	protected void onCreate(Bundle b) {
//		super.onCreate(b);
//		setContentView(R.layout.main);
//		
////		// default to tab navigation
////        showTabsNav();
//        
//        // create a couple of simple fragments as placeholders
//        final int MARGIN = 16;
//        leftFrag = new CameraFragment(getResources().getColor(
//                R.color.android_green), 1f, MARGIN, MARGIN / 2, MARGIN, MARGIN);
//        rightFrag = new CameraFragment(getResources().getColor(
//                R.color.honeycombish_blue), 2f, MARGIN / 2, MARGIN, MARGIN,
//                MARGIN);
//
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.add(R.id.root, leftFrag);
//        ft.add(R.id.root, rightFrag);
//        ft.commit();
//	}
//
//	private void showTabsNav() {
//		// TODO Auto-generated method stub
//		
//	}
//}