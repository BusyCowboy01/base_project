package com.wsw.essearch.controller;


import com.wsw.common.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log")
public class LoggerController {

	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("log")
	public Object testLog(){
		
		logger.debug("this is debug level");
		logger.info("this is info level ");
		logger.warn("this is warn level ");
		logger.error("this is error level!");
		return JsonData.buildSuccess();
	}
	
}
