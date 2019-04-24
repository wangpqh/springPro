package com.mypqh.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")//标识UserDao bean
public class UserDaoImpl implements UserDao {
    @Override
    public void saveDao() {
        System.out.println("userDao----saveDao----");
    }
}
