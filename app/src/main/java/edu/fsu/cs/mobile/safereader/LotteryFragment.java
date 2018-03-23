package edu.fsu.cs.mobile.safereader;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Kevin on 3/22/2018.
 */

public class LotteryFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state){
        ScrollView scroller = new ScrollView(getActivity());
        TextView text = new TextView(getActivity());
        scroller.addView(text);
        text.setText(R.string.lottery);
        return scroller;
    }
}
