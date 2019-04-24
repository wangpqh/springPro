package com.mypqh.aspect;

public class MyAspect {
//    jdk动态代理的切面类
    public void check_permission(){
        System.out.println("检查权限");
    }
    public void log(){
        System.out.println("日志记录");
    }
}
