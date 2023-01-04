package com.felipemoreira.strconsumer.common.exceptions;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.info("EXCEPTION_HANDLER ::: Capture error ...");
        return null;
    }

//    @Override
//    public Object handleError(Message<?> message, ListenerExecutionFailedException exception,
//        Consumer<?, ?> consumer) {
//        return KafkaListenerErrorHandler.super.handleError(message, exception, consumer);
//    }
//
//    @Override
//    public Object handleError(Message<?> message, ListenerExecutionFailedException exception,
//        Consumer<?, ?> consumer, Acknowledgment ack) {
//        return KafkaListenerErrorHandler.super.handleError(message, exception, consumer, ack);
//    }
}
