package com.btn.wk.brokethenews.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.btn.wk.brokethenews.BuildConfig;
import com.btn.wk.brokethenews.R;

public class MainActivity extends AppCompatActivity implements INewsViewimpl {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.DEBUG) Log.d("MainActivity", "222:" + 222);


    }

    @Override
    public void hehe() {



    }
}
