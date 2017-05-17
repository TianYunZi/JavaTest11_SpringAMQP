package org.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2017/5/17.
 */
@Service
public class MessageProducer {
    private Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Object message) {
        logger.info("to send message:{}", message);
        amqpTemplate.convertAndSend("queueTestKey", message);
    }
}
