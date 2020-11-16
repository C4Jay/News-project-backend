package com.example.demo.controller;

import com.example.demo.dao.*;
import com.example.demo.models.*;
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

    @Autowired
    private ClassifiedNewsDataAccessService classifiedNewsDataAccessService;

    @Autowired
    private TestNewsDataAccessService testNewsDataAccessService;

    @Autowired
    private RecommendedNewsDataAccessService recommendedNewsDataAccessService;

    @Autowired
    private SummarizedNewsDataAccessService summarizedNewsDataAccessService;

    @Autowired
    private CategoricalNewsDataAccessService categoricalNewsDataAccessService;

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

// all classified news
    @GetMapping("classified")
    public List<ClassifiedNews> getClassifiedNews() {
        return classifiedNewsDataAccessService.findAll();
    }

//    one classified news
    @GetMapping("classified/{id}")
    public Optional<ClassifiedNews> getClassifiedNewsById(@PathVariable("id") Integer id) {
        return classifiedNewsDataAccessService.findById(id);
    }

//    testnews by joining tables
    @GetMapping("testnews")
    public List<TestNews> getTestNewsById() {
        return testNewsDataAccessService.findNews();
    }

//    all recommended news
    @GetMapping("recommended")
    public List<RecommendedNews> getRecommendedNews() {
        return recommendedNewsDataAccessService.findAll();
    }

//    one recommended news
    @GetMapping("recommended/{id}")
    public Optional<RecommendedNews> getRecommendedNewsById (@PathVariable("id") Integer id) {
        return recommendedNewsDataAccessService.findById(id);
    }

//    all summarized news
    @GetMapping("summarized")
    public List<SummarizedNews> geSummarizedNews() {
        return summarizedNewsDataAccessService.findAll();
    }

//    one summarized news
    @GetMapping("summarized/{id}")
    public Optional<SummarizedNews> getSummarizedNewsById(@PathVariable("id") Integer id) {
        return summarizedNewsDataAccessService.findById(id);
    }

    @GetMapping("categorical/{id}")
    public List<CategoricalNews> getNewsByCategory(@PathVariable("id") String id) {
        return categoricalNewsDataAccessService.findComplainsById(id);
    }


}
