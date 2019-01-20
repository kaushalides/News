package com.ittrend.news;

public class NewsModel {
    private int newsId;
    private String newsType;
    private String newsTopic;
    private String newsDescription;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getNewsTopic() {
        return newsTopic;
    }

    public void setNewsTopic(String newsTopic) {
        this.newsTopic = newsTopic;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }
}
