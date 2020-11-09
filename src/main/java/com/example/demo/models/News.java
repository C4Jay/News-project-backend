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


    public News(Integer news_id, String title, String body) {
        this.news_id = news_id;
        this.title = title;
        this.body = body;
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
}
