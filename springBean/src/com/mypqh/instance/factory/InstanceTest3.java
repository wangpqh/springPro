package com.mypqh.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    public static void main(String[] args) {

        String xmlPath="com/mypqh/instance/factory/bean3.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean3"));

    }
}
