package com.example.demo.models;

import javax.persistence.Id;

public class CategoricalNews {

    private Integer news_id;
    private String title;
    private String body;
//    private Integer cat_id;




    public CategoricalNews() {
    }

    public CategoricalNews(Integer news_id,
//                           Integer cat_id,
                           String title, String body) {
        this.news_id = news_id;
//        this.cat_id = cat_id;
        this.title = title;
        this.body = body;
    }

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

//    public Integer getCat_id() {
//        return cat_id;
//    }
//
//    public void setCat_id(Integer cat_id) {
//        this.cat_id = cat_id;
//    }

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

}
