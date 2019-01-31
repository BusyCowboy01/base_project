package com.wsw.mybatis.service;

import com.wsw.mybatis.entity.User;

import java.util.List;

public interface UserService {

	public int add(User user);
	
	
	
	/**
	 * 功能描述：测试事务
	 * @return
	 */
	public int addAccount();

	List<User> findAll();
	
}
