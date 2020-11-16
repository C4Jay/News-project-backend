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
//    private Integer cat_id;
    private String category;
//    private Integer subcat01_id;
//    private Integer subcat02_id;
    private String subcategory01;
    private String subcategory02;


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

    public String getSubcategory02() {
        return subcategory02;
    }

    public void setSubcategory02(String subcategory02) {
        this.subcategory02 = subcategory02;
    }

//    public Integer getCat_id() {
//        return cat_id;
//    }
//
//    public void setCat_id(Integer cat_id) {
//        this.cat_id = cat_id;
//    }

//    public Integer getSubcat01_id() {
//        return subcat01_id;
//    }
//
//    public void setSubcat01_id(Integer subcat01_id) {
//        this.subcat01_id = subcat01_id;
//    }
//
//    public Integer getSubcat02_id() {
//        return subcat02_id;
//    }
//
//    public void setSubcat02_id(Integer subcat02_id) {
//        this.subcat02_id = subcat02_id;
//    }
}
