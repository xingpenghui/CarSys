package com.feri.car.msg.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.msg.dao.MessageMapper;
import com.feri.car.msg.entity.Message;
import com.feri.car.msg.service.MessageService;
import com.feri.car.util.JedisUtil;
import com.feri.car.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private JedisUtil jedisUtil;
    @Override
    public R save(Message message) {
        if(messageMapper.insert(message)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryAll(String token) {
        //获取令牌
        if(token!=null && token.length()>0){
           int uid=Integer.parseInt(JwtUtil.parseJWT(token));
           return R.Ok(messageMapper.selectAll(uid));
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryById(int id) {
        return R.Ok(messageMapper.selectById(id));
    }
}
