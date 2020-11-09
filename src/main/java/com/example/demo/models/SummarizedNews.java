package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "summerized_news")
public class SummarizedNews {

    @Id
    private Integer summery_id;
    private String title;
    private String summerized_article;
    private Integer news_id;

    public SummarizedNews(Integer summery_id, String title, String summerized_article, Integer news_id) {
        this.summery_id = summery_id;
        this.title = title;
        this.summerized_article = summerized_article;
        this.news_id = news_id;
    }

    public SummarizedNews() {
    }

    public Integer getSummery_id() {
        return summery_id;
    }

    public void setSummery_id(Integer summery_id) {
        this.summery_id = summery_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
