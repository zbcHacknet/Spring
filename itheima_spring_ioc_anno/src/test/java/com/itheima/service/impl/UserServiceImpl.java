package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userServic" class="com.itheima.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
//@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;
    //<property name="userDao" ref="userDao"></property>
    //@Autowired  按照数据类型从Spring容器中进行匹配的
    //@Qualifier("userDao") //按照id值从容器中进行匹配的,此处主要@Qualifier结合@Autowired一起使用
    @Resource(name = "userDao")  //@Resource相当于@
    private UserDao userDao;

  /*  public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public  void inti(){
        System.out.println("Service 对象的初始化方法");
    }

    @PreDestroy
    public  void destory(){
        System.out.println("Service 对象的销毁方法");
    }
}
