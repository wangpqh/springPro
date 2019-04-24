package com.mypqh.instance.factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("beans3工厂实例化");
    }
    //创建bean3实例方法
    public Bean3 createBean(){
        return new Bean3();
    }
}
