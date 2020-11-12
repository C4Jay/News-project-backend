package com.example.demo.models;

public class TestNews {

    private Integer news_id;
    private String title;
    private String body;
    private String summerized_article;


    public TestNews(Integer news_id, String title, String body, String summerized_article) {
        this.news_id = news_id;
        this.title = title;
        this.body = body;
        this.summerized_article = summerized_article;
    }

    public TestNews() {
    }

    public Integer getId() {
        return news_id;
    }

    public void setId(Integer id) {
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

    public String getSummerized_article() {
        return summerized_article;
    }

    public void setSummerized_article(String summerized_article) {
        this.summerized_article = summerized_article;
    }
}
