package com.feri.car.user.service;

import com.feri.car.common.vo.R;
import com.feri.car.user.entity.Member;

public interface MemberService {
    //查询
    R queryByMsg(String msg);
    //注册
    R register(Member member);
    //登录
    R login(Member member);


}
