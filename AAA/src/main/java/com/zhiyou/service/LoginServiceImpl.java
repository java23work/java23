package com.zhiyou.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.LoginMapper;
import com.zhiyou.model.User;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper mapper;
	
	@Override
	public User login(String username, String password) {
		Map<String,String> map = new HashMap<>();
		map.put("username", username);
		map.put("password", password);
		User user = mapper.login(map);
		return user;
	}

}
