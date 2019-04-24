package com.mypqh.jdbc;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    @Test
    public void mainTest(){
//    public static void main(String[] args) {
        String xmlPath="com/mypqh/jdbc/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
//        获取jdbctemplate实例
        JdbcTemplate jdbcTemplate= (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("CREATE TABLE account(id INT PRIMARY KEY auto_increment,username varchar(50),balance double)");
        System.out.println("账户表account创建成功！");
    }
    @Test
    public void addAcountTest(){
        String xmlPath="com/mypqh/jdbc/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
//        获取jdbctemplate实例
        AccountDao accountDao= (AccountDao) applicationContext.getBean("accountDao");
        Account account=new Account();
        account.setUsername("litang");
        account.setBalance(1000.00);
        int num=accountDao.addAccount(account);
        if(num>0){
            System.out.println("插入"+num+"条数据！");
        }else{
            System.out.println("插入数据失败");
        }
    }
}
