package com.mypqh.jdk;

import com.mypqh.aspect.MyAspect;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler{
//声明目标类接口
    UserDao userDao;
//    创建代理方法
    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        ClassLoader classLoader=JdkProxy.class.getClassLoader();
        Class[] clazz=userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,clazz,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //声明切面
        MyAspect myAspect=new MyAspect();
//        前通知
        myAspect.check_permission();
//        目标类调用方法
        Object obj =method.invoke(userDao,args);
//        后通知
        myAspect.log();
        return obj;
    }
}
