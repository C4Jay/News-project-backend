package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "recommended_news")
public class RecommendedNews {

    @Id
    private Integer recommended_id;
    private Integer summery_id;
    private Integer user_id;
    private Integer ratings;
    private Integer pred_news_id;

    public RecommendedNews(Integer recommended_id, Integer summery_id, Integer user_id, Integer ratings, Integer pred_news_id) {
        this.recommended_id = recommended_id;
        this.summery_id = summery_id;
        this.user_id = user_id;
        this.ratings = ratings;
        this.pred_news_id = pred_news_id;
    }

    public RecommendedNews() {
    }

    public Integer getRecommended_id() {
        return recommended_id;
    }

    public void setRecommended_id(Integer recommended_id) {
        this.recommended_id = recommended_id;
    }

    public Integer getSummery_id() {
        return summery_id;
    }

    public void setSummery_id(Integer summery_id) {
        this.summery_id = summery_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public Integer getPred_news_id() {
        return pred_news_id;
    }

    public void setPred_news_id(Integer pred_news_id) {
        this.pred_news_id = pred_news_id;
    }
}
