package com.coder.viewpagerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ViewPager mViewPager;
    private ImageView[] tips;
    private ImageView[] mImageView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastF();
    }

    private void toastF() {
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show();
    }


}
