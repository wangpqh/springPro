package com.mypqh.instance.static_factory;

import com.mypqh.instance.constructor.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {

        String xmlPath="com/mypqh/instance/static_factory/bean2.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Bean2 bean= (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean);
    }
}
