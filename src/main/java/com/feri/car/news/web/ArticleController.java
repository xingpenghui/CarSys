package com.feri.car.news.web;

import com.feri.car.common.vo.R;
import com.feri.car.dto.ArticleQueryDto;
import com.feri.car.news.entity.Article;
import com.feri.car.news.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-13 11:51
 */
@RestController
@Api(value = "实现资讯的相关操作",tags = "实现资讯的相关操作")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    //查询列表
    @ApiOperation(value = "实现资讯的列表查询",notes = "实现资讯的列表查询，支持搜索和分页")
    @GetMapping("api/news/newspage.do")
    public R page(ArticleQueryDto queryDto){
        return articleService.queryPage(queryDto);
    }
    //查询详情
    @ApiOperation(value = "实现资讯的详细信息的查询",notes = "实现资讯的详细信息的查询")
    @GetMapping("api/news/newsdetail.do")
    public R detail(int id){
        return articleService.queryById(id);
    }
    //新增
    @ApiOperation(value = "实现资讯的新增",notes = "实现资讯的新增")
    @PostMapping("api/news/newssave.do")
    public R save(@RequestBody Article article){
        return articleService.save(article);
    }
    //删除
    @ApiOperation(value = "实现资讯的删除",notes = "实现资讯的删除")
    @DeleteMapping("api/news/newsdel.do")
    public R del(int id){
        return articleService.del(id);
    }
}
