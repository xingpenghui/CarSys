package com.feri.car.car.web;

import com.feri.car.car.service.CarService;
import com.feri.car.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 11:32
 */
@Api(value = "实现车辆品牌的管理",tags = "实现车辆品牌的管理")
@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @ApiOperation(value = "实现车系的所有款型的查询",notes = "实现车系的所有款型的查询")
    @GetMapping("/api/car/allbymid.do")
    public R all(int mid){
        return carService.queryAll(mid);
    }

    @ApiOperation(value = "实现车辆详情信息的查询",notes = "实现车辆详情信息的查询")
    @GetMapping("/api/car/cardetail.do")
    public R detail(int id){
        return carService.queryDetail(id);
    }
}
