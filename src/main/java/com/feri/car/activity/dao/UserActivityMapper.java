package com.feri.car.activity.dao;


import com.feri.car.activity.entity.UserActivity;
import com.feri.car.dto.UserActivityDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserActivityMapper {
    int insert(UserActivity record);
    List<UserActivityDto> selectByUid(int uid);

}