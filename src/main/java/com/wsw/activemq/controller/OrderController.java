package com.wsw.activemq.controller;

import com.wsw.activemq.domain.JsonData;
import com.wsw.activemq.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Autowired
	private ProducerService producerService;
	/**
	 * 点对点模式
	 */
	@GetMapping("order")
	public Object order(String msg){
		
		Destination destination = new ActiveMQQueue("order.queue");
		
		producerService.sendMessage(destination, msg);
	
       return JsonData.buildSuccess();
	}

	/**
	 * 点对点2
	 * @param msg
	 * @return
	 */
	@GetMapping("common")
	public Object common(String msg){
	   	producerService.sendMessage(msg);
	   	return JsonData.buildSuccess();
	}

	/**
	 * 发布订阅模式
	 */
	@GetMapping("pub")
	public Object publish(String msg){
		producerService.publish(msg);
		return JsonData.buildSuccess();
	}

}
