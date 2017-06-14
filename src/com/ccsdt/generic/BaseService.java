package com.ccsdt.generic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenrun on 2017/6/13.
 */
public class BaseService<T>{
    @Autowired
    private BaseRepository<T> baseRepository;

    public void add(){
        System.out.println("BaseService...");
        System.out.println(baseRepository);
    }
}
