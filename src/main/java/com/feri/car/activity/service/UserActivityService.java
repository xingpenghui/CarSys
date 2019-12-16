package com.feri.car.activity.service;

import com.feri.car.activity.entity.UserActivity;
import com.feri.car.common.vo.R;

public interface UserActivityService {
    //报名
    R save(UserActivity us);
    //查询会员报名的活动
    R queryById(String token);

}
