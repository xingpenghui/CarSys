package com.feri.car.common.vo;

import lombok.Data;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-10 11:03
 */
@Data
public class R {
    private int code;//结果码
    private String msg;//字符串
    private Object data;//携带数据
}
