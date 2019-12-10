package com.feri.car.user.web;

import com.feri.car.common.vo.R;
import com.feri.car.user.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-10 11:23
 */
@Api(value = "实现会员的相关操作",tags = "实现会员的相关操作")
@RestController //标记返回的是字符串 json/xml格式 代替：@Controller+@ResponseBody
public class MemberController {
    @Autowired
    private MemberService memberService;


    @ApiOperation(value = "校验会员的注册名称是否重复",notes = "校验会员的注册名称是否重复")
    @GetMapping("/api/user/member/checkName.do")
    public R checkMsg(String msg){
        return memberService.queryByMsg(msg);
    }


}
