package com.feri.car.test;

import com.feri.car.util.AliOssUtil;
import org.junit.Test;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-12 15:11
 */
public class Oss_Test {
    @Test
    public void upload(){
      String u=  AliOssUtil.upload("hello.json","{msg:'下课了'}");
        System.out.println(u);
    }
}
