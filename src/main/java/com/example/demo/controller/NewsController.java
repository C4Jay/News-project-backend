package com.example.demo.controller;

import com.example.demo.dao.NewsDataAccessService;
import com.example.demo.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/")
@RestController
@CrossOrigin(origins = "*")
public class NewsController {

    @Autowired
    private NewsDataAccessService newsDataAccessService;

//    all news
    @GetMapping("news")
    public List<News> getAllNews() {
        return newsDataAccessService.findAll();
    }


}
