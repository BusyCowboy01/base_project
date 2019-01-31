package com.wsw.schedultask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 功能描述：定时任务业务类
 */
//@Component
public class TestTask {


	@Scheduled(fixedRateString="2000")//两秒执行一次
	//@Scheduled(cron="*/2 * * * * *")
	public void sum() throws InterruptedException{
		System.out.println("执行结束，当前时间:"+new Date());

	}

	
}
