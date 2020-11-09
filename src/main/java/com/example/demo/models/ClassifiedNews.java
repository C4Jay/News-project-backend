package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "classified_news")
public class ClassifiedNews implements Serializable {

    @Id
    private Integer pred_news_id;
    private Integer news_id;
    private Integer cat_id;
    private Integer subcat01_id;
    private Integer subcat02_id;


    public ClassifiedNews() {
    }

    public Integer getPred_news_id() {
        return pred_news_id;
    }

    public void setPred_news_id(Integer pred_news_id) {
        this.pred_news_id = pred_news_id;
    }

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Integer getSubcat01_id() {
        return subcat01_id;
    }

    public void setSubcat01_id(Integer subcat01_id) {
        this.subcat01_id = subcat01_id;
    }

    public Integer getSubcat02_id() {
        return subcat02_id;
    }

    public void setSubcat02_id(Integer subcat02_id) {
        this.subcat02_id = subcat02_id;
    }
}
