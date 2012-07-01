package com.dosoftware.facedex;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

import com.actionbarsherlock.app.SherlockFragment;

public class CameraFragment extends SherlockFragment {

    private int mColour;
	private float mWeight;
	private View mView;
	private int marginLeft;
	private int marginRight;
	private int marginTop;
	private int marginBottom;


	// need a public empty constructor for framework to instantiate
	public CameraFragment() {
		
	}
	
	public CameraFragment(int colour, float weight, int margin_left,
            int margin_right, int margin_top, int margin_bottom) {
        mColour = colour;
        mWeight = weight;
        marginLeft = margin_left;
        marginRight = margin_right;
        marginTop = margin_top;
        marginBottom = margin_bottom;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new View(getActivity());

//        GradientDrawable background = (GradientDrawable) getResources()
//                .getDrawable(R.drawable.rounded_rect);
//        background.setColor(mColour);

        //mView.setBackgroundDrawable(background);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0,
                LayoutParams.FILL_PARENT, mWeight);
        lp.setMargins(marginLeft, marginTop, marginRight, marginBottom);
        mView.setLayoutParams(lp);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return mView;
    }

}
