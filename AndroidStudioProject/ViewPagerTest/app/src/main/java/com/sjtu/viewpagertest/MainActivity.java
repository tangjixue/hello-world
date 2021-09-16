package com.sjtu.viewpagertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        int[] data = new int[] {
                R.mipmap.blue, R.mipmap.grey, R.mipmap.white, R.mipmap.red
        };

        ViewPager viewPager = findViewById(R.id.view_pager);
        BannerAdapter bannerAdapter = new BannerAdapter(this, data);
        viewPager.setAdapter(bannerAdapter);

        viewPager.setPageMargin(10); // 设置滑动的两页之间的间距
        viewPager.setOffscreenPageLimit(3);
        viewPager.setCurrentItem(1);
        viewPager.setPageTransformer(true, new ScaleTransformer());


    }
}