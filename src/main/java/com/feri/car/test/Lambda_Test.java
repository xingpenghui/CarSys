package com.feri.car.test;

import org.junit.Test;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-13 11:26
 */
public class Lambda_Test {
    public static void main(String[] args) {
        //原来
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程，就得嚣张");
            }
        });
        //启动线程
        thread.start();

        //现在
        Thread thread1=new Thread(()->{
            System.out.println("我是拉姆达表达式");
        });
        thread1.start();
    }
    //Junit4 单元测试 不支持jdk1.8 junit5之后才支持jdk1.8
    @Test
    public void t1(){
        //原来
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线程，就得嚣张");
            }
        });
        //启动线程
        thread.start();

        //现在
        Thread thread1=new Thread(()->{
            System.out.println("我是拉姆达表达式");
        });
        thread1.start();
    }
}
