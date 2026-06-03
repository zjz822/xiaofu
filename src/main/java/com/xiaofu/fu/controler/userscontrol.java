package com.xiaofu.fu.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaofu.fu.pojo.Result;
import com.xiaofu.fu.pojo.user;
import com.xiaofu.fu.service.userserimpl;

@RestController
@RequestMapping("/auto")
public class userscontrol {
    private userserimpl Userserimpl;

    public userscontrol(userserimpl Userserimpl){
        this.Userserimpl=Userserimpl;
    }
    
    @PostMapping("/login")
    public Result login(@RequestBody user u){
        if(Userserimpl.user(u))
        return Result.success("登录成功");
        else
            return Result.error("登录失败");
    }

    @PostMapping("/register")
    public Result register (@RequestBody user u){
        Userserimpl.register(u);
        return Result.success("注册成功");
    }
}
