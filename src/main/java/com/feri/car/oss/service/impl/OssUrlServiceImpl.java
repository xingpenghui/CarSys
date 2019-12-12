package com.feri.car.oss.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.oss.dao.OssUrlDao;
import com.feri.car.oss.entity.OssUrl;
import com.feri.car.oss.service.OssUrlService;
import com.feri.car.util.AliOssUtil;
import com.feri.car.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Service
public class OssUrlServiceImpl implements OssUrlService {

    @Autowired
    private OssUrlDao urlDao;

    @Override
    public R upload(MultipartFile file) {
        //1、校验文件是否为空
        if(!file.isEmpty()){
            //2、获取上传的文件名
            String fn=file.getOriginalFilename();
            //3、重命名
            fn=rename(fn);
            try {
                //4、上传到OSS服务器
                Date date= DateUtil.addYear(3);
              String u=AliOssUtil.upload(fn,file.getBytes(),date);
              //5、保存数据到数据库
                OssUrl ossUrl=new OssUrl();
                ossUrl.setUrl(u);
                ossUrl.setObjname(fn);
                ossUrl.setEndtime(date);
                urlDao.insert(ossUrl);
                return R.Ok(ossUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return R.fail();
    }
    @Override
    public R queryAll() {
        return R.Ok(urlDao.selectAll());
    }
    @Override
    public R queryOssAll() {
        return R.Ok(AliOssUtil.list());
    }
    @Override
    public R del(String objName) {
        if(AliOssUtil.del(objName)){
            urlDao.del(objName);
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    //对文件名 1、截取 2、重命名
    private String rename(String fn){
        if(fn.length()>40){
            fn=fn.substring(fn.length()-40);
        }
        return UUID.randomUUID().toString()+"_"+fn;
    }
}
