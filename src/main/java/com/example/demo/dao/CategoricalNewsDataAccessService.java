package com.example.demo.dao;

import com.example.demo.models.CategoricalNews;
import com.example.demo.models.TestNews;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class CategoricalNewsDataAccessService {

    @PersistenceContext
    private EntityManager em;

    static final String STATEMENT_SQLMAP1 = "Statement-SQL-Mapping1";

    public List<CategoricalNews> findComplainsById(@Param("id") String id) {
        Query querysummary = em.createNativeQuery(
                "SELECT s.news_id, s.title, s.body, s.url, s.date, c.subcategory01, c.subcategory02, m.summerized_article FROM scraped_news_articles s JOIN classified_news c ON s.news_id=c.news_id JOIN summerized_news m ON s.news_id=m.news_id  WHERE (c.category=:id)  ",
                STATEMENT_SQLMAP1);
        querysummary.setParameter("id", id);
        return querysummary.getResultList();
    }

    public List<CategoricalNews> findNewsBySubCategory(@Param("id") String id) {
        Query querysummary = em.createNativeQuery(
                "SELECT s.news_id, s.title, s.body, s.url, s.date, c.subcategory01, c.subcategory02, m.summerized_article FROM scraped_news_articles s JOIN classified_news c ON s.news_id=c.news_id JOIN summerized_news m ON s.news_id=m.news_id  WHERE (c.subcategory01=:id)  ",
                STATEMENT_SQLMAP1);
        querysummary.setParameter("id", id);
        return querysummary.getResultList();
    }

    @SqlResultSetMapping(name= STATEMENT_SQLMAP1, classes = {
            @ConstructorResult(targetClass = CategoricalNews.class,
                    columns = {
                            @ColumnResult(name="news_id",type = Integer.class),
                            @ColumnResult(name="title",type = String.class),
                            @ColumnResult(name="body",type = String.class),
                            @ColumnResult(name="url",type = String.class),
                            @ColumnResult(name="date",type = String.class),
                            @ColumnResult(name="subcategory01",type = String.class),
                            @ColumnResult(name="subcategory02",type = String.class),
                            @ColumnResult(name="summerized_article",type = String.class),
                    }
            )
    }) @Entity class SQLMappingCfgEntityy{@Id int id;} // <- workaround

//    @Entity class SQLMappingCfgEntityy{@Id Integer id;} // <- workaround

}
