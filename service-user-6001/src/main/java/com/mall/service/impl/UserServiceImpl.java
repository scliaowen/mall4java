package com.mall.service.impl;

import com.mall.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String test() {
        return "hello~";
    }
}
