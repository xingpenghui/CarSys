package com.feri.car.news.dao;

import com.feri.car.dto.ArticleTouchDto;
import com.feri.car.news.entity.Article;
import com.feri.car.news.entity.ArticleTouch;

import java.util.List;

public interface ArticleTouchMapper {
    int insert(ArticleTouch record);
    int del(ArticleTouch touch);
    List<ArticleTouchDto> selectAll(int mid);
}