package com.feri.car.user.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.user.dao.MemberMapper;
import com.feri.car.user.entity.Member;
import com.feri.car.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-10 11:23
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public R queryByMsg(String msg) {
        return null;
    }

    @Override
    public R register(Member member) {
        return null;
    }

    @Override
    public R login(Member member) {
        return null;
    }
}
