package com.example.demo.service;

import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Async("asyncExecutor")
    public void addOne(UserInfo userInfo) {
        long start = System.currentTimeMillis();
        userInfoMapper.insertSelective(userInfo);
        long end = System.currentTimeMillis();
        log.info("add userInfo use: {}ms", (end - start));
    }
}
