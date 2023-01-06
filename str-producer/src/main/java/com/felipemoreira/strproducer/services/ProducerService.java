package com.felipemoreira.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message with success {}", message);
        kafkaTemplate.send("str-topics", message);
//        .addCallback(
//            success -> {
//                if(success != null) {
//                    log.info("Send message with success {}", message);
//                    log.info("Partition {}, Offset {}",
//                        success.getRecordMetadata().partition(),
//                        success.getRecordMetadata().offset());
//                }
//            },
//            error -> log.error("Error send message")
//        );
    }
}