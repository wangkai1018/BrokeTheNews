package com.btn.wk.brokethenews.model;

import com.btn.wk.brokethenews.entity.News;

import java.util.List;

/**
 * Created by wangkai on 16/3/25.
 */
public interface INewsModelimpl {

    /**
     * 获取新闻内容
     * @return
     */
    List<News> getNewsData(String NewsClassName);

    /**
     * 获取新闻种类
     * @return
     */
    List<String> getNewsClassNames();
}
