package com.mypqh.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {

//        构造器实例化

        String xmlPath="com/mypqh/instance/constructor/beans1.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Bean1 bean= (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean);
    }
}
