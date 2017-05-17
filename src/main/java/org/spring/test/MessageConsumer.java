package org.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by Admin on 2017/5/17.
 */
public class MessageConsumer implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Override
    public void onMessage(Message message) {
        logger.info("收到消息:{}", message);
    }
}
