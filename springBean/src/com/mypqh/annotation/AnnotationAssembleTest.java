package com.mypqh.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        String xmlPath="com/mypqh/annotation/bean6.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserController userController= (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
