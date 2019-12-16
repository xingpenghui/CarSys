package com.feri.car.car.dao;

import com.feri.car.car.entity.CarModel;

import java.util.List;

public interface CarModelMapper {
    int insert(CarModel record);
    List<CarModel> selectByBid(int bid);
}