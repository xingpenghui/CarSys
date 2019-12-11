package com.feri.car.test;

import com.feri.car.util.AliSmsUtil;
import com.feri.car.util.RandomUtil;
import org.junit.Test;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-11 22:22
 */
public class Sms_Test {
    @Test
    public void sendMs(){
        AliSmsUtil.sendSmsCode("18515990152", RandomUtil.createNum(6));
    }
}
