package com.chanbo.bottomnavigatorview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chanbo.library.BottomNavigatorView;
import com.chanbo.library.NavigatorItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigatorView mBottomNavigatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigatorView = (BottomNavigatorView) findViewById(R.id.bottomview);

        mBottomNavigatorView.addItem(new NavigatorItem("图标1", R.mipmap.ic_launcher));
        mBottomNavigatorView.addItem(new NavigatorItem("图标2", R.mipmap.ic_launcher));
        mBottomNavigatorView.addItem(new NavigatorItem("图标3", R.mipmap.ic_launcher));

    }
}
