package com.aprj.config;


import com.aprj.dao.UserLoginDao;
import com.aprj.entities.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
public class DataInit {

    @Value("${server.port}")
    private String port;

    private static final String adminName = "admin";
    private static final String adminPassword = "admin";

    private final UserLoginDao userLoginDao;

    @Autowired
    public DataInit(UserLoginDao userLoginDao) {
        this.userLoginDao = userLoginDao;
    }

    @PostConstruct
    @Transactional
    public void dataInit() {
        UserLogin userLoggin = userLoginDao.findUserLoginByUserNameAndPassword(adminName,adminPassword);
        if (userLoggin == null) {
            userLoggin = new UserLogin();
            userLoggin.setUserName(adminName);
            userLoggin.setPassword(adminPassword);
            userLoginDao.save(userLoggin);
        }
        System.out.println("application run success in : http://localhost:" + port);
    }

}