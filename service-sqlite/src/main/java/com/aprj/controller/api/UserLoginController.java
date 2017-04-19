package com.aprj.controller.api;

import com.aprj.entities.UserLogin;
import com.aprj.service.impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wyp0596 on 06/03/2017.
 */
@RestController
@RequestMapping("api/user")
public class UserLoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserLogin> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void createUserLogin(UserLogin userLogin) {
        userService.save(userLogin);
    }

}
