package com.feri.car.car.service;

import com.feri.car.common.vo.R;

public interface CarService {

    //查询车系下的所有款型
    R queryAll(int mid);
    //查询车辆的详细信息
    R queryDetail(int id);


}