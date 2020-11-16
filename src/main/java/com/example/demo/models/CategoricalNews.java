package com.example.demo.models;

import javax.persistence.Id;

public class CategoricalNews {

    private Integer news_id;
    private String title;
    private String body;
//    private Integer cat_id;
    private String subcategory01;
    private String subcategory02;
    private String summerized_article;





    public CategoricalNews() {
    }

    public CategoricalNews(Integer news_id,
//                           Integer cat_id,
                           String title, String body,
                           String subcategory01,
                           String subcategory02,
                           String summerized_article) {
        this.news_id = news_id;
//        this.cat_id = cat_id;
        this.title = title;
        this.body = body;
        this.subcategory01 = subcategory01;
        this.subcategory02 = subcategory02;
        this.summerized_article = summerized_article;
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

    public String getSubcategory01() {
        return subcategory01;
    }

    public void setSubcategory01(String subcategory01) {
        this.subcategory01 = subcategory01;
    }

    public String getSubcategory02() {
        return subcategory02;
    }

    public void setSubcategory02(String subcategory02) {
        this.subcategory02 = subcategory02;
    }

    public String getSummerized_article() {
        return summerized_article;
    }

    public void setSummerized_article(String summerized_article) {
        this.summerized_article = summerized_article;
    }
}
