package com.wsw.mybatis.serviceimpl;


import com.wsw.mybatis.entity.User;
import com.wsw.mybatis.mapper.UserDao;
import com.wsw.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	 private UserDao userDao;
	 
	@Override
	public int add(User user) {
		userDao.insert(user);
		int id = user.getId();
		return id;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int addAccount() {
		User user = new User();
		user.setAge(88);
		user.setCreateTime(new Date());
		user.setName("测试事务啦加入事务");
		user.setPhone("10010101010");
		userDao.insert(user);
		int i = 19/0;
		
		return 0;
	}

	@Override
	public List<User> findAll() {
		return userDao.getAll();
	}

}
