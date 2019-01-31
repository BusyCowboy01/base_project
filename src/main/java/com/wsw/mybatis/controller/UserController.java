package com.wsw.mybatis.controller;

import com.wsw.common.JsonData;
import com.wsw.mybatis.entity.User;
import com.wsw.mybatis.mapper.UserDao;
import com.wsw.mybatis.mapper.UserMapper;
import com.wsw.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 功能描述: user 保存接口
	 * @return
	 */
	@GetMapping("/add")
	public Object add(){
		
		User user = new User();
		user.setAge(11);
		user.setCreateTime(new Date());
		user.setName("test");
		user.setPhone("10010000");
		int id = userService.add(user);
		
       return JsonData.buildSuccess(id);
	}
	
	
	
	/**
	 * 功能描述：查找全部用户
	 * @return
	 */
	@GetMapping("/userfindAll")
	public Object findAll(){
		
       return JsonData.buildSuccess(userService.findAll());
	}
	
	
	
	@GetMapping("/find_by_id")
	public Object findById(long id){
       return JsonData.buildSuccess(userDao.findById(id));
	}
	
	
	@GetMapping("/del_by_id")
	public Object delById(long id){
	userDao.delete(id);
       return JsonData.buildSuccess();
	}
	
	@GetMapping("/update")
	public Object update(String name,int id){
		User user = new User();
		user.setName(name);
		user.setId(id);
		userDao.update(user);
	    return JsonData.buildSuccess();
	}

	
	//测试事务
	@GetMapping("/add_account")
	public Object addAccount(){
		int id = userService.addAccount();
	    return JsonData.buildSuccess(id);
	}

	@GetMapping("/findAll2")
	public Object findAllByMapper(){
		List<User> list = userMapper.findAll();
		return JsonData.buildSuccess(list);
	}

	@GetMapping("/findById2")
	public Object findByIdAndMapper(int id){
		User user = userMapper.getUserById(id);
		return JsonData.buildSuccess(user);
	}
	
	
}
