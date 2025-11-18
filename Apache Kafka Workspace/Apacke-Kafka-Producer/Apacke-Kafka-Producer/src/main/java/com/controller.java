package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka_producer")
public class controller {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping(value = "send/{value}")
    public String sendMessage(@PathVariable String value) {
            kafkaTemplate.send("topic1",value);
            return "Send the data to Apache Kafka";
    }

    @GetMapping(value = "sendIterative/{num}")
    public String sendIterativeMessage(@PathVariable int num) {
        for(int i=0;i<num;i++) {
            kafkaTemplate.send("topic1","Message "+i);
        }
        return "Send the data to Apache Kafka";
    }
}
