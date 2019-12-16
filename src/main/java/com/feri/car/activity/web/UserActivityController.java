package com.feri.car.activity.web;

import com.feri.car.activity.entity.UserActivity;
import com.feri.car.activity.service.ActivityService;
import com.feri.car.activity.service.UserActivityService;
import com.feri.car.common.vo.R;
import com.feri.car.config.SystemConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 11:21
 */
@Api(value = "实现用户活动的相关操作",tags = "实现用户活动的相关操作")
@RestController
public class UserActivityController {
    @Autowired
    private UserActivityService service;

    @ApiOperation(value = "实现会员活动报名",notes ="实现会员活动报名")
    @PostMapping("/api/useractivity/save.do")
    public R save(@RequestBody UserActivity activity){
        return service.save(activity);
    }
    @ApiOperation(value = "实现会员的所有活动的查询",notes ="实现会员的所有活动的查询")
    @GetMapping("/api/useractivity/all.do")
    public R list(HttpServletRequest request){
        return service.queryById(request.getHeader(SystemConfig.TOKEN_USER));
    }




}
