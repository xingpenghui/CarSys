package com.feri.car.news.service;

import com.feri.car.common.vo.R;
import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.entity.Article;

public interface ArticleService {
    //新增
    R save(Article article);
    //查询详情
    R queryById(int id);
    //查询列表--分页，条件，类型
    R queryPage(ArticleQueryDto queryDto);
    //删除
    R del(int id);

}
