package com.mypqh.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
//    封装jdbcTemplate便于调用
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql ="insert into account(username,balance) values(?,?)";
        Object[] objects=new Object[]{account.getUsername(),account.getBalance()};
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int updateAccount(Account account) {
        return 0;
    }

    @Override
    public int deleteAccount(int id) {
        return 0;
    }


}
