package com.ukg.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
//@AllArgsConstructor
public class MessageController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/publish/{msg}")
    public String sendMesage(@PathVariable("msg") String msg){
        kafkaTemplate.send("NewTopic",msg);
        return "message sent";
    }
    @GetMapping("/publish1")
    public String sendMesage1(@RequestParam("message") String msg){
        kafkaTemplate.send("NewTopic",msg);
        return "message sent1";
    }

}
