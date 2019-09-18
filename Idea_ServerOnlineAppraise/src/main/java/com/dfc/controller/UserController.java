package com.dfc.controller;


import com.dfc.Service.UserService;
import com.dfc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public  Boolean  getLogin(User user){
        System.out.println(user);
        return userService.getLogin(user);
    }




}
