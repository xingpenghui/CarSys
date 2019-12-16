package com.feri.car;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//开关类
@SpringBootApplication //标记 这是SpringBoot项目
@EnableSwagger2 //启用Swagger的扫描
@MapperScan("com.feri.car.user.dao,com.feri.car.oss.dao,com.feri.car.news.dao,com.feri.car.activity.dao,com.feri.car.car.dao,com.feri.car.msg.dao")
public class CarSysApplication {
	//main方法
	public static void main(String[] args) {
		//加载初始信息
		SpringApplication.run(CarSysApplication.class, args);
	}
}