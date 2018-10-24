package com.hhymyi.study.test;

import com.hhymyi.study.entity.Message;
import com.hhymyi.study.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
//        Message message = (Message) context.getBean("message");
//        System.out.println(message.getContent());
        IMessageService messageService=(IMessageService) context.getBean("messageService");
        messageService.insert(null);
    }
}
