package com.ccsdt.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by chenrun on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
        DataSource dataSource= (DataSource) ctx.getBean("datasource");
        System.out.println(dataSource.getConnection());
    }
}
