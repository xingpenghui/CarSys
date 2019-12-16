package com.feri.car.car.service.impl;

import com.feri.car.car.dao.CarModelMapper;
import com.feri.car.car.service.CarModelService;
import com.feri.car.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarModelServiceImpl implements CarModelService {

    @Autowired
    private CarModelMapper modelMapper;
    @Override
    public R queryByBid(int bid) {
        return R.Ok(modelMapper.selectByBid(bid));
    }

}