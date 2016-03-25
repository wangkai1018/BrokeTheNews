package com.btn.wk.brokethenews.presenter;

import com.btn.wk.brokethenews.model.INewsModelimpl;
import com.btn.wk.brokethenews.model.NewsModel;
import com.btn.wk.brokethenews.view.INewsViewimpl;

/**
 * Created by wangkai on 16/3/25.
 * MVP模式中的P——presenter-主导器
 */
public class NewsPresenter {
    private INewsViewimpl newsView;
    private INewsModelimpl newsModel;

    public NewsPresenter(INewsViewimpl newsView) {

        this.newsView =newsView;
        newsModel=new NewsModel();
    }



    /**
     * 填写供View层调用的方法
     */


}