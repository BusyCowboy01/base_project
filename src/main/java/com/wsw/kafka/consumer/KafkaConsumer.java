//package com.wsw.kafka.consumer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @KafkaListener(topics = {"test"})
//    public void consumerMessage(String message) {
//        logger.info("on message:{}", message);
//    }
//}
