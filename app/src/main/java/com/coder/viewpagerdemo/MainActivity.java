package com.coder.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import View.ViewPagerIndicator;

public class MainActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private ViewPagerIndicator mIndicator;
    private List<String> mTitles = Arrays.asList("短信", "收藏", "推荐");
    private List<SimpleFragment> mContents = new ArrayList<SimpleFragment>();
    private FragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        initDatas();
    }

    private void initDatas() {

    }

    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mIndicator = (ViewPagerIndicator) findViewById(R.id.id_indicator);
    }

}
