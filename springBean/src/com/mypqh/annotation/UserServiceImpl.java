package com.mypqh.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")//标识UserService bean
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")//对属性标注，配合完成bean配置
    UserDao userDao;
    @Override
    public void save() {
       userDao.saveDao();//调用UserDao方法
        System.out.println("userService---save---");
    }
}
