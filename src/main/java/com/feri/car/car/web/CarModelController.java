package com.feri.car.car.web;

import com.feri.car.car.service.CarModelService;
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
 * @create: 2019-12-16 14:44
 */
@RestController
@Api(value = "实现车系的管理",tags = "实现车系的管理")
public class CarModelController {
    @Autowired
    private CarModelService modelService;
    @ApiOperation(value = "查询品牌下面的所有车系信息",notes = "查询品牌下面的所有车系信息")
    @GetMapping("/api/carmodel/querybybid.do")
    public R all(int bid){
        return modelService.queryByBid(bid);
    }
}
