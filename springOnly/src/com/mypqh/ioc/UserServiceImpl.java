package com.mypqh.ioc;

public class UserServiceImpl implements UserService {
    //    声明属性
    private UserDao userDao;

    //    添加setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        userDao.say();//调用UserDao方法
        System.out.println("使用UserService实现say（）方法，hello world");
    }
}
