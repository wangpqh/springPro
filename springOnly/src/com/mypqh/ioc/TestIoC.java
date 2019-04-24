package com.mypqh.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

    public static void main(String[] args) {
//        初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取UserDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        调用实例方法Say
        userDao.say();

    }

}
