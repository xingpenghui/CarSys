package com.feri.car.activity.web;

import com.feri.car.activity.service.ActivityService;
import com.feri.car.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 11:21
 */
@Api(value = "活动相关操作",tags = "活动相关操作")
@RestController
public class ActivityController {
    @Autowired
    private ActivityService service;

    @ApiOperation(value = "实现主页的轮播图的查询",notes = "实现主页的轮播图的查询")
    @GetMapping("/api/activity/conver.do")
    public R conver(){
        return service.queryConver();
    }

    @ApiOperation(value = "实现新车特惠活动的查询",notes = "实现新车特惠活动的查询")
    @GetMapping("/api/activity/newacitivity.do")
    public R newActivity(){
        return service.queryNew();
    }

    @ApiOperation(value = "实现所有未失效的活动查询",notes = "实现所有未失效的活动查询")
    @GetMapping("/api/activity/all.do")
    public R all(){
        return service.queryList();
    }

}
