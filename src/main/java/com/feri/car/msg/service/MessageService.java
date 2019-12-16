package com.feri.car.msg.service;

import com.feri.car.common.vo.R;
import com.feri.car.msg.entity.Message;

public interface MessageService {
    R save(Message message);
    R queryAll(String token);
    R queryById(int id);
}
