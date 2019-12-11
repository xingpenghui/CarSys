package com.feri.car.sms.service;

import com.feri.car.common.vo.R;
import com.feri.car.dto.PhoneCodeDto;

public interface SmsService {

    R sendSmsCode(String phone);
    R checkSmsCode(PhoneCodeDto codeDto);
}
