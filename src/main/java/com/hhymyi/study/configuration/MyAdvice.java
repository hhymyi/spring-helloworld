package com.hhymyi.study.configuration;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("myAdvice")
public class MyAdvice {
    Logger logger= LoggerFactory.getLogger(MyAdvice.class);
    public void around(ProceedingJoinPoint joinpoint) throws Throwable {
        logger.info("around before");
        joinpoint.proceed();
        logger.info("around after");
    }

    public void before(){
        logger.info("before");
    }

    public void after(){
        logger.info("after");
    }
}
