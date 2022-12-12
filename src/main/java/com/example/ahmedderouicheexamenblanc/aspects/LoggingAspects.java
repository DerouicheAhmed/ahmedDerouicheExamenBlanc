package com.example.ahmedderouicheexamenblanc.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspects {

      @After("execution(* com.example.ahmedderouicheexamenblanc.services.*.*(..))")
    public void logoutMethod(JoinPoint joinPoint){
        log.info("Bon  Method: "+joinPoint.getSignature().getName());
    }

}
