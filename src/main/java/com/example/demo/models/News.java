package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "scraped_news_articles")
public class News implements Serializable {

    @Id
    private Integer news_id;
    private String title;
    private String body;
//    private String url;
//    private String date;


    public News(Integer news_id, String title, String body
//            , String url, String date
    ) {
        this.news_id = news_id;
        this.title = title;
        this.body = body;
//        this.url = url;
//        this.date = date;
    }

    public News() {
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

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
}
