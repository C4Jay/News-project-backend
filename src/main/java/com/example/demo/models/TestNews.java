package com.example.demo.models;

public class TestNews {

    private Integer news_id;
    private String title;
    private String body;
    private String summerized_article;
    private String date;
    private String category;
    private String subcategory01;

    public TestNews(Integer news_id, String title, String body, String summerized_article, String date, String category, String subcategory01) {
        this.news_id = news_id;
        this.title = title;
        this.body = body;
        this.summerized_article = summerized_article;
        this.date = date;
        this.category = category;
        this.subcategory01 = subcategory01;
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

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory01() {
        return subcategory01;
    }

    public void setSubcategory01(String subcategory01) {
        this.subcategory01 = subcategory01;
    }
}
