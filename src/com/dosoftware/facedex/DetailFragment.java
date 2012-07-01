package com.dosoftware.facedex;

import com.actionbarsherlock.app.SherlockFragment;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends SherlockFragment {
	public DetailFragment() {
		
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_details, container, false);
		return view;
	}

//	public void setText(String item) {
//		TextView view = (TextView) getView().findViewById(R.id.detailsText);
//		AnimatorSet set = new AnimatorSet();
//		set.playTogether(
//				ObjectAnimator.ofFloat(view, "alpha", 0, 0.10f, 1)
//				);
//		set.setDuration(5 * 100).start();
//		view.setText(item);
//	}
}
