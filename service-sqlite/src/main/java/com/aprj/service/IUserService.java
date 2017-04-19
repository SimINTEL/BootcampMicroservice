package com.aprj.service;


import com.aprj.entities.UserLogin;
import com.aprj.models.LoginModel;
import com.aprj.models.UserLoginModel;

import java.util.List;

public interface IUserService {

	public List<UserLogin> getAllUsers();
	
	public void save(UserLogin person);
    
    public UserLoginModel getUser(LoginModel loginModel);
}
