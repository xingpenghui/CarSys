package com.feri.car.news.dao;

import com.feri.car.news.entity.ArticleAction;

public interface ArticleActionMapper {
    int insert(ArticleAction record);

    int insertSelective(ArticleAction record);
}