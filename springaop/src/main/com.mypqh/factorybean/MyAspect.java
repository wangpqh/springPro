package com.mypqh.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {//环绕通知案例切面类

    public void check_mission(){
        System.out.println("检查权限---");
    }
    public void log(){
        System.out.println("记录日志---");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_mission();
        Object obj =methodInvocation.proceed();//执行目标方法
        log();
        return obj;
    }
}
