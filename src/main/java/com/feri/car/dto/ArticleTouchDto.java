package com.feri.car.dto;

import lombok.Data;

import java.util.Date;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-13 11:42
 */
@Data
public class ArticleTouchDto {
    private int id;
    private int mid;
    private int aid;
    private String title;
    private String summary;//摘要
    private String cover_pic;//封面图片
    private Date ctime;
}