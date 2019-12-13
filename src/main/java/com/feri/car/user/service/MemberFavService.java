package com.feri.car.user.service;

import com.feri.car.common.vo.R;
import com.feri.car.user.entity.MemberFav;

public interface MemberFavService {
    //收藏资讯
    R saveC(MemberFav fav);
    //取消收藏
    R delC(MemberFav fav);
}
