package com.example.demo.controller;

import com.example.demo.dao.NewsDataAccessService;
import com.example.demo.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//    One news
    @GetMapping("news/{id}")
    public Optional<News> getOneNews(@PathVariable("id") Integer id) {
        return newsDataAccessService.findById(id);
    }


}
