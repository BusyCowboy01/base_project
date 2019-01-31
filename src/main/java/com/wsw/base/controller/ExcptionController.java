package com.wsw.base.controller;


import com.wsw.base.domain.User;
import com.wsw.common.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 功能描述：异常测试
 */
@RestController
@RequestMapping(value = "/exception")
public class ExcptionController {

	 
	/**
	 * 功能描述：模拟全局异常
	 * @return
	 */
	@RequestMapping(value = "/test_ext")
	public Object index() {
		int i= 1/0;
		return new User(11, "sfsfds", "1000000", new Date());
	}

	
	/**
	 * 功能描述：模拟自定义异常
	 * @return
	 */
	@RequestMapping("/myext")
	public Object myexc(){
		
		throw new MyException("499", "my ext异常");
		
	}
	
}
