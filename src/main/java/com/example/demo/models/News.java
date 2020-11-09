package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "scraped_news_articles")
public class News {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String body;

    public News(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public News() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
