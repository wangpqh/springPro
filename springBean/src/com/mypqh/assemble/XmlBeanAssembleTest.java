package com.mypqh.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        String xmlPath="com/mypqh/assemble/bean5.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        System.out.println("构造注入"+applicationContext.getBean("user1"));
        System.out.println("seeter方法注入"+applicationContext.getBean("user2"));
    }
}
