package com.ccsdt.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by HP on 2017/6/11.
 */
@Repository
public class UserRepositoryAction implements UserRepository {
    @Override
    public void add() {
        System.out.println("UserRepositoryAction....");
    }
}
