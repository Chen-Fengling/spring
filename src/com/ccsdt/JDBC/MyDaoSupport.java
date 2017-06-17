package com.ccsdt.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * 不推荐使用，比较繁琐
 */
@Repository
public class MyDaoSupport extends JdbcDaoSupport{

    @Autowired
    public void setDataSource2(DataSource dataSource){
        setDataSource(dataSource);
    }

    public Actor getActorById(Integer integer){
        String select = "select actor_id id,first_name firstName,last_name lastName,last_update lastUpdate from actor_test where actor_id =?";
        RowMapper<Actor> rowMapper = new BeanPropertyRowMapper<>(Actor.class);
        return getJdbcTemplate().queryForObject(select,rowMapper,integer);
    }

    public static void main(String[] args) {
        MyDaoSupport myDaoSupport = new MyDaoSupport();
        System.out.println(myDaoSupport.getActorById(3));
    }
}
