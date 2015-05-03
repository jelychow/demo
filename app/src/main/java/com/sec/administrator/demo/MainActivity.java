package com.sec.administrator.demo;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        this.getWindow().setBackgroundDrawableResource(getResources().getColor(android.R.color.holo_blue_bright));
//        设定状态栏的颜色，当版本大于4.4时起作用
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(android.R.color.holo_blue_bright);
        }

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("mainTitle");// 标题的文字需在setSupportActionBar之前，不然会无效

        setSupportActionBar(mToolbar);
        mToolbar.setNavigationContentDescription("hello");
         //this is what we want
        mToolbar.setNavigationIcon(android.R.drawable.ic_media_play);
        //logo is just for show
        mToolbar.setLogo(android.R.drawable.ic_media_play);
    }


}
