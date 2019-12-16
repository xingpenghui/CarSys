package com.feri.car.msg.dao;


import com.feri.car.msg.entity.Message;

import java.util.List;

public interface MessageMapper {
    int insert(Message record);
    List<Message> selectAll(int uid);
    Message selectById(int id);
}