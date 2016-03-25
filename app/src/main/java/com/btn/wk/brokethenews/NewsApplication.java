package com.btn.wk.brokethenews;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by wangkai on 16/3/25.
 */
public class NewsApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化一些app运行的资源

        Toast.makeText(getApplicationContext(), "我是NewsApplication", Toast.LENGTH_SHORT).show();
    }
}
