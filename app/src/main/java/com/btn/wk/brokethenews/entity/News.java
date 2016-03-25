package com.btn.wk.brokethenews.entity;

/**
 * Created by wangkai on 16/3/25.
 */
public class News {

    /**
     * ctime : 2016-03-25
     * title : 没想到我们老了以后，会是这种爷爷奶奶。。。
     * description : 冷笑话精选
     * picUrl : http://zxpic.gtimg.com/infonew/0/wechat_pics_-4191353.jpg/640
     * url : http://mp.weixin.qq.com/s?__biz=MjM1ODIzNTU2MQ==&idx=2&mid=411401019&sn=21f84b71e662574977999eea138c449c
     */



    public News(String title, String description, String picUrl, String url, String ctime) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.url = url;
        this.ctime = ctime;
    }

    public News() {

    }

    /**
     * 新闻的标题
     */
    private String title;

    /**
     * 新闻的描述
     */
    private String description;

    /**
     * 新闻的标题图
     */
    private String picUrl;
    /**
     * 新闻的详细地址
     */
    private String url;
    /**
     * 新闻的时间
     */
    private String ctime;
    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", url='" + url + '\'' +
                ", ctime='" + ctime + '\'' +
                '}';
    }
}





