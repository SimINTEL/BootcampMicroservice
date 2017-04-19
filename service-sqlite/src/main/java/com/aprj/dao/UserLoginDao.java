package com.aprj.dao;

import com.aprj.entities.UserLogin;
import org.springframework.data.repository.CrudRepository;

public interface UserLoginDao extends CrudRepository<UserLogin, Long> {

   UserLogin findUserLoginByUserNameAndPassword(String username, String password);
}
