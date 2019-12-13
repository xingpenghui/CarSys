package com.feri.car.news.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.news.dao.ArticleActionMapper;
import com.feri.car.news.dao.ArticleTouchMapper;
import com.feri.car.news.entity.ArticleTouch;
import com.feri.car.news.service.ArticleTouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleTouchServiceImpl  implements ArticleTouchService {
    @Autowired
    private ArticleTouchMapper touchMapper;

    @Override
    public R save(ArticleTouch touch) {
        if(touchMapper.insert(touch)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R del(ArticleTouch touch) {
        if(touchMapper.del(touch)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R list(int mid) {
        return R.Ok(touchMapper.selectAll(mid));
    }
}
