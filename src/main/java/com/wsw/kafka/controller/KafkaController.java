//package com.wsw.kafka.controller;
//
//import com.wsw.activemq.domain.JsonData;
//import com.wsw.kafka.producer.KafkaProducer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/kafka")
//public class KafkaController {
//
//    @Autowired
//    private KafkaProducer kafkaProducer;
//
//    @GetMapping("push")
//    public Object order(String msg){
//        kafkaProducer.sendMessage("test",msg);
//        return JsonData.buildSuccess();
//    }
//
//}
