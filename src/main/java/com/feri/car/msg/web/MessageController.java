package com.feri.car.msg.web;

import com.feri.car.common.vo.R;
import com.feri.car.config.SystemConfig;
import com.feri.car.msg.entity.Message;
import com.feri.car.msg.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-16 11:34
 */
@Api(value = "实现消息的相关操作",tags = "实现消息的相关操作")
@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;
    //新增消息
    @ApiOperation(value = "实现消息的发送",notes = "实现消息的发送，站内信")
    @PostMapping("/api/message/sendmsg.do")
    public R send(@RequestBody Message message){
        return messageService.save(message);
    }
    //查询消息列表
    @ApiOperation(value = "实现会员的消息查询",notes = "实现会员的消息查询")
    @GetMapping("/api/message/querymsg.do")
    public R selectAll(HttpServletRequest request){
        return messageService.queryAll(request.getHeader(SystemConfig.TOKEN_USER));
    }
    @ApiOperation(value = "实现消息详情查询",notes = "实现消息详情查询")
    @GetMapping("/api/message/msgdetail.do")
    public R selectDetail(int id){
        return messageService.queryById(id);
    }
}