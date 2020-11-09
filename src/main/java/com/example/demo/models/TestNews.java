package com.example.demo.models;

public class TestNews {

    private Integer id;
    private String title;
    private Integer pred_news_id;

    public TestNews(Integer id, String title, Integer pred_news_id) {
        this.id = id;
        this.title = title;
        this.pred_news_id = pred_news_id;
    }

    public TestNews() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPred_news_id() {
        return pred_news_id;
    }

    public void setPred_news_id(Integer pred_news_id) {
        this.pred_news_id = pred_news_id;
    }
}
