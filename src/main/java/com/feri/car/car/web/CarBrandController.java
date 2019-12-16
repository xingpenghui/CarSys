package com.feri.car.car.web;

import com.feri.car.car.service.CarBrandService;
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
 * @create: 2019-12-16 14:40
 */
@Api(value = "实现车辆品牌的管理",tags = "实现车辆品牌的管理")
@RestController
public class CarBrandController {
    @Autowired
    private CarBrandService service;

    @ApiOperation(value = "查询所有的车辆品牌信息",notes = "查询所有的车辆品牌信息")
    @GetMapping("/api/carbrand/all.do")
    public R all(){
        return service.queryAll();
    }
}
