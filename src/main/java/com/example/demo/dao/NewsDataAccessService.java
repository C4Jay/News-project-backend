package com.example.demo.dao;

import com.example.demo.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDataAccessService extends JpaRepository<News, Integer> {
}
