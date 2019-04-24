package com.mypqh.ioc;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("userdao实现类实现Say()方法，hello world");
    }
}
