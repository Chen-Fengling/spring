package com.ccsdt;

import com.ccsdt.collection.NewTeacher;
import com.ccsdt.collection.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by chenrun on 2017/5/22.
 */
public class Main {
    public static void main(String[] args) {
        //传统方法打印Hello World
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("ccsdt");
        helloWorld.hello();

        //Spring context 方法
        //1、创建Spring 的IOC容器
        //ApplicationContext 代表IOC容器
        //FileSystemXmlApplicationContext是接口ApplicationContext的实现类，从系统路径加载
        //ClassPathXmlApplicationContext是接口ApplicationContext的实现类，从类路径加载
        ApplicationContext appletContext = new FileSystemXmlApplicationContext("C:\\MyWork\\SMVC\\spring\\resources\\ApplicationContext.xml");
        //2、从容器中获取HelloWorld的bean对象
        //利用id获取Bean
//        HelloWorld helloWorld2 = (HelloWorld) appletContext.getBean("helloWorld");
        //利用类型获取Bean,要求只能有一个该类型的Bean
        HelloWorld helloWorld2 = appletContext.getBean(HelloWorld.class);

        //3、调用hello方法
        helloWorld2.hello();

        Car car = (Car)appletContext.getBean("car1");
        System.out.println(car);
        car = (Car)appletContext.getBean("car2");
        System.out.println(car);
        car = (Car)appletContext.getBean("car3");
        System.out.println(car);
        car = (Car)appletContext.getBean("car4");
        System.out.println(car);

        Person person = (Person)appletContext.getBean("person");
        System.out.println(person);

        car = (Car)appletContext.getBean("car5");
        System.out.println(car);

        person = (Person)appletContext.getBean("person2");
        System.out.println(person);

        Teacher teacher = (Teacher)appletContext.getBean("teacher");
        System.out.println(teacher);

        NewTeacher newTeacher = (NewTeacher)appletContext.getBean("NewTeacher");
        System.out.println(newTeacher);

        Teacher teacher2 = (Teacher)appletContext.getBean("teacher2");
        System.out.println(teacher2);

        Teacher teacher3 = (Teacher)appletContext.getBean("teacher3");
        System.out.println(teacher3);


    }
}
