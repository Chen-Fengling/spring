package com.ccsdt.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


/**
 * Created by HP on 2017/6/17.
 */
@Repository
public class ActorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Actor getActorById(Integer i){
        String select = "select actor_id id,first_name firstName,last_name lastName,last_update lastUpdate from actor_test where actor_id =?";
        RowMapper<Actor> rowMapper = new BeanPropertyRowMapper<>(Actor.class);
        return jdbcTemplate.queryForObject(select,rowMapper,3);
    }
}
