package com.example.demo.models;

import javax.persistence.Id;

public class NewsAll {
    @Id
    private Integer news_id;
    private String title;
    private String body;
    private String category;


    public NewsAll(Integer news_id, String title, String body, String category) {
        this.news_id = news_id;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
