package com.feri.car.car.service.impl;

import com.feri.car.car.dao.CarBrandMapper;
import com.feri.car.car.service.CarBrandService;
import com.feri.car.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarBrandServiceImpl implements CarBrandService {

    @Autowired
    private CarBrandMapper mapper;
    @Override
    public R queryAll() {
        return R.Ok(mapper.selectAll());
    }
}
