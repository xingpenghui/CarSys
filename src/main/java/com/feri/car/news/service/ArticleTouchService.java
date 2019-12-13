package com.feri.car.news.service;

import com.feri.car.common.vo.R;
import com.feri.car.news.entity.ArticleTouch;

public interface ArticleTouchService {
    //点赞
    R save(ArticleTouch touch);
    //取消点赞
    R del(ArticleTouch touch);
    //我的
    R list(int mid);
}
