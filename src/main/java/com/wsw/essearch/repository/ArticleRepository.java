package com.wsw.essearch.repository;


import com.wsw.essearch.domain.Article;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {


}
