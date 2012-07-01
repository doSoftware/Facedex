package com.dosoftware.facedex;

import com.actionbarsherlock.app.SherlockListFragment;
import com.dosoftware.utils.IntentHelper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
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

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] values = { "Dummy", "List", "Elements" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Fragment fragment;
		fragment = (Fragment) getFragmentManager()
				.findFragmentById(R.id.rightFragment);
		if(fragment != null && fragment.getClass() == DetailFragment.class) {
			DetailFragment f = (DetailFragment) getFragmentManager()
					.findFragmentById(R.id.rightFragment);
			f.setText(item);
		}
		else if(fragment != null && fragment.getClass() == CameraFragment.class) {
			
		}
	}
}
