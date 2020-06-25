package com.example.demo;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import com.example.demo.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.mapper.UserInfoMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class TestController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/test")
    public Object hello(long id) {
        LogUtil.buildLogId();
        log.info("Hello World!");
        for (int i=0 ; i < 500000; i ++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setName("胡说八道");
            userInfo.setAddress("中关村");
            userInfo.setIdCard("522631" + i);
            userInfo.setPhone("134" + i);
            userInfoService.addOne(userInfo);
        }
        return "success";
    }
}
