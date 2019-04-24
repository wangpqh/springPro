package com.mypqh.assemble;

import java.util.List;

public class User {
    String username;
    Integer password;
    List<String> list;

//    1、使用构造注入
    public User(String username,Integer password,List<String> list){
        super();
        this.username=username;
        this.password=password;
        this.list=list;
    }

//    setter注入
//    默认构造方法+setter
    public User(){
        super();
    }
    public void setUsername(String username){
        this.username=username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String toString(){
        return  "User [username="+username+",password="+password+",list="+list+"]";
    }
 }
