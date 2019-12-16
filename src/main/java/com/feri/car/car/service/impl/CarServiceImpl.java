package com.feri.car.car.service.impl;

import com.feri.car.car.dao.CarMapper;
import com.feri.car.car.entity.CarModel;
import com.feri.car.car.service.CarService;
import com.feri.car.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired//完成对象实例化 注入  原因IOC实例
    private CarMapper mapper;

    @Override
    public R queryAll(int mid) {
        return R.Ok(mapper.selectByMid(mid));
    }

    @Override
    public R queryDetail(int id) {
        return R.Ok(mapper.selectById(id));
    }
}