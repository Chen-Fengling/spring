package com.ccsdt.annotation.service;

import com.ccsdt.annotation.component.UserComponent;
import com.ccsdt.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by HP on 2017/6/11.
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userRepositoryAction")
    private UserRepository userRepository;

    @Autowired(required = false)
    private UserComponent userComponent;

    public void test(){
        System.out.println("UserService ActorDao.....");
        userRepository.add();
    }
}
