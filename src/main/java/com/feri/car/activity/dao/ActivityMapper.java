package com.feri.car.activity.dao;


import com.feri.car.activity.entity.Activity;
import com.feri.car.dto.ActivityDto;

import java.util.List;

public interface ActivityMapper {
    int insert(Activity record);
    //查询轮播信息
    List<ActivityDto> selectConver();
    //查询新车特惠 查询未失效的
    List<ActivityDto> selectNew();
    //查询所有活动  未失效
    List<ActivityDto> selectAll();


}