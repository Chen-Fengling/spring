package com.ccsdt.annotation.controller;

import com.ccsdt.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by HP on 2017/6/11.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void test(){
        userService.test();
    }

}
