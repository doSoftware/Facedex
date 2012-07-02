package com.dosoftware.utils;

import com.dosoftware.facedex.DetailFragment;
import com.dosoftware.facedex.LoadingFragment;
import com.dosoftware.facedex.R;
import com.dosoftware.facedex.RecentImageListFragment;
import com.dosoftware.facedex.SplitFragment;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
//
//AnimatorSet set = new AnimatorSet();
//set.playTogether(
//		ObjectAnimator.ofFloat(tv, "alpha", 0, 0.25f, 1)
//		);
//set.setDuration(5 * 100).start();
public class FragmentHelper {
	private SplitFragment mSplitFragment;
	private LoadingFragment mLoadingFragment;

	public static final String TAG_SplitFragment = "split_tag";
	public static final String TAG_LoadingFragment = "loading_tag";

	private FragmentHelper() {
		mSplitFragment = new SplitFragment();
		mLoadingFragment = new LoadingFragment();
	}

	private void showSplitFragment(Context c, FragmentTransaction ft) {		
		if(mLoadingFragment.isAdded() || mLoadingFragment.isInLayout()) ft.remove(mLoadingFragment);
		if(!mSplitFragment.isAdded() || !mSplitFragment.isInLayout()) ft.add(R.id.root, mSplitFragment);
	}

	private void showLoadingFragment(FragmentTransaction ft) {
		if(!mSplitFragment.isAdded() || mSplitFragment.isInLayout()) ft.remove(mSplitFragment);
		if(!mLoadingFragment.isAdded() || !mSplitFragment.isInLayout()) ft.add(R.id.root, mLoadingFragment);
	}
//
//	public void showSplitFragment(FragmentTransaction ft) {
//		
//	}
}
