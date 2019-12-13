package com.feri.car.news.dao;

import com.feri.car.news.entity.ArticleCategory;

public interface ArticleCategoryMapper {
    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);
}