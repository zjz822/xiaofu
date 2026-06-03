package com.xiaofu.fu.service;

import org.springframework.stereotype.Service;

import com.xiaofu.fu.mapper.usersdao;
import com.xiaofu.fu.pojo.user;

@Service
public class userserimpl implements userser{
    private final usersdao Usersdao;

    public userserimpl(usersdao Usersdao){
        this.Usersdao=Usersdao;
    }
    
    @Override
    public boolean  user(user u){
        Integer lo=Usersdao.login(u);
        if(lo==1)
            return true;
        else
            return false;
    }

    @Override
    public void register(user u){
            Integer exists = Usersdao.login(u);   // 复用 login 查询
    if (exists != null) {
        throw new RuntimeException("用户名已存在");  // 或自定义异常
    }
    Usersdao.register(u);
    }
}
