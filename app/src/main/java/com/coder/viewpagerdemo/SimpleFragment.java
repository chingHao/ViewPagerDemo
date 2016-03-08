package com.coder.viewpagerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by chingHao on 2016/3/8 0008.
 */
public class SimpleFragment extends Fragment {
    private String mTitle;
    private static final String BUNDLE_TITLE="title";

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle=getArguments();
        if (bundle!=null){
            mTitle=bundle.getString(BUNDLE_TITLE);
        }
        TextView mTextView=new TextView(getActivity());
        mTextView.setText(mTitle);
        mTextView.setGravity(Gravity.CENTER);

        return mTextView;
    }

    public static SimpleFragment newInstance(String title){
        Bundle bundle=new Bundle();
        bundle.putString(BUNDLE_TITLE,title);

        SimpleFragment simpleFragment=new SimpleFragment();
        simpleFragment.setArguments(bundle);
        return simpleFragment;
    }
}
