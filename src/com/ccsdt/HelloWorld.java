package com.ccsdt;

/**
 * Created by chenrun on 2017/5/22.
 */
public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("Construct starting...... ");
    }

    public void setName(String name) {
        System.out.println("SetName:"+name);
        this.name = name;
    }

    public void hello(){
        System.out.println("hello "+name);
    }
}
