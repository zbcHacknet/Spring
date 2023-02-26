package com.itheima.web;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
         UserService userService = app.getBean(UserService.class);
         userService.save();
        ((ClassPathXmlApplicationContext)app).close();
    }
}
