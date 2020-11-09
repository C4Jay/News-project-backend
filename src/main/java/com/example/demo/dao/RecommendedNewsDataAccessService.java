package com.example.demo.dao;

import com.example.demo.models.RecommendedNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendedNewsDataAccessService extends JpaRepository<RecommendedNews, Integer> {
}
