package com.zhiyou.mapper;

import java.util.Map;

import com.zhiyou.model.User;

public interface LoginMapper {

	User login(Map<String, String> map);

}
