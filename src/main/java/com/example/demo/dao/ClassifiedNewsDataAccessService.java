package com.example.demo.dao;

import com.example.demo.models.ClassifiedNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClassifiedNewsDataAccessService  extends JpaRepository<ClassifiedNews, Integer> {
}
