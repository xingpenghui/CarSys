package com.feri.car.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 12:01
 */
@Data
public class ActivityDto {
    private int id;
    private String name;
    private String aurl;
    private Date startTime;
    private Date endTime;
}
