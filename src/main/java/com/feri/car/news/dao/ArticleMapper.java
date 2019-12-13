package com.feri.car.news.dao;

import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.entity.Article;

import java.util.List;

public interface ArticleMapper {
    int insert(Article record);
    Article selectById(int id);
    List<Article> selectAll(ArticleQueryDto queryDto);
    int update(int id);
}