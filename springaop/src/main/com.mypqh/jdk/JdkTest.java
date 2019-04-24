package com.mypqh.jdk;

public class JdkTest {
    public static void main(String[] args) {
        //创建代理对象
        JdkProxy jdkProxy=new JdkProxy();
        //创建目标对象
        UserDao userDao=new UserDaoImpl();
        //从代理对象中获取通知后的目标对象
        UserDao userDao1= (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
