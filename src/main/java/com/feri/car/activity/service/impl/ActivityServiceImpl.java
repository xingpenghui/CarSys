package com.feri.car.activity.service.impl;

import com.feri.car.activity.dao.ActivityMapper;
import com.feri.car.activity.service.ActivityService;
import com.feri.car.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl  implements ActivityService {
    @Autowired
    private ActivityMapper mapper;

    @Override
    public R queryConver() {
        return R.Ok(mapper.selectConver());
    }

    @Override
    public R queryNew() {
        return R.Ok(mapper.selectNew());
    }

    @Override
    public R queryList() {
        return R.Ok(mapper.selectAll());
    }
}
