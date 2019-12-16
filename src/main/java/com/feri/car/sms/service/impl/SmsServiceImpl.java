package com.feri.car.sms.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.config.RedisKeyConfig;
import com.feri.car.dto.PhoneCodeDto;
import com.feri.car.sms.service.SmsService;
import com.feri.car.util.AliSmsUtil;
import com.feri.car.util.JedisUtil;
import com.feri.car.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-11 15:37
 */
@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    private JedisUtil jedisUtil;
    @Override
    public R sendSmsCode(String phone) {
        int code;
        //1、校验之前的验证码有没有失效
        if(jedisUtil.checkKey(RedisKeyConfig.SMS_CODE+phone)){
            //验证码未失效
            //1、更改有效期 重新设置为10分钟
            code=Integer.parseInt(jedisUtil.getStr(RedisKeyConfig.SMS_CODE+phone));
            //jedisUtil.setExpire(RedisKeyConfig.SMS_CODE+phone,RedisKeyConfig.SMSCODE_TIME);
            //2、检测有效期剩余超过1半 不改变直接返回 小于一半 重新更新有效期
            //3、重新生成 把原来覆盖

        }else {
            //生成验证码
            code= RandomUtil.createNum(4);
        }
        //2、发送短信
        AliSmsUtil.sendSmsCode(phone,code);
        //3、验证码记录到Redis
        jedisUtil.addStr(RedisKeyConfig.SMS_CODE+phone,code+"",RedisKeyConfig.SMSCODE_TIME);
        return R.Ok();
    }

    @Override
    public R checkSmsCode(PhoneCodeDto codeDto) {
        //1、校验验证码有效性
        if(jedisUtil.checkKey(RedisKeyConfig.SMS_CODE+codeDto.getPhone())){
            //2、校验是否正确
            if(codeDto.getCode()== Integer.parseInt(jedisUtil.getStr(RedisKeyConfig.SMS_CODE+codeDto.getPhone()))){
                return R.Ok();
            }
        }
        return R.fail("校验失败");
    }
}
