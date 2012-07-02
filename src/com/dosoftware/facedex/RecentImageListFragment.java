package com.dosoftware.facedex;

import com.actionbarsherlock.app.SherlockListFragment;
import com.dosoftware.utils.FragmentHelper;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RecentImageListFragment extends SherlockListFragment {

	public RecentImageListFragment() {

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	String[] values = { "Dummy", "List", "Elements", "I have", "So very", "very very very", "many many" };
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
		
	}

	//FragmentHelper fh;
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		TextView tv = (TextView) getActivity().findViewById(R.id.detailsText);
		if(tv != null) tv.setText(item);
	}
}
