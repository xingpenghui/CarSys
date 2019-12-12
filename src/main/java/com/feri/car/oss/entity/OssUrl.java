package com.feri.car.oss.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-12 15:41
 */
@Data
public class OssUrl {
    private Integer id;
    private String objname;
    private String url;
    private Date ctime;
    private Date endtime;
}
