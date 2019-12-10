package com.feri.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开关类
@SpringBootApplication //标记 这是SpringBoot项目
public class CarSysApplication {

	//main方法
	public static void main(String[] args) {
		//加载初始信息
		SpringApplication.run(CarSysApplication.class, args);
	}
}