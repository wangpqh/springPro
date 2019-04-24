package com.mypqh.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")//标识UserController bean
public class UserController {
    @Resource(name="userService")
    UserService userService;

    public void save(){
        userService.save();
        System.out.println("userController---save----");
    }
}
