package com.hhymyi.study.service.impl;

import com.hhymyi.study.entity.Message;
import com.hhymyi.study.service.IMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("messageService")
public class MessageServiceImpl implements IMessageService {
    Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    public Integer insert(Message message) {
        logger.info("insert message");
        return 1;
    }
}
