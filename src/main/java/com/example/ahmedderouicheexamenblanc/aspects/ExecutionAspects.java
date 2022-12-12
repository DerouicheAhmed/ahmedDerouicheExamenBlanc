package com.example.ahmedderouicheexamenblanc.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@Slf4j
public class ExecutionAspects {
   // @Around("execution(* com.example.springprojetkaddem.kaddem.services.ContratServiceImplemt.addContrat(..))")
    public Object LoginMethod(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        Object o =(Object) pjp.proceed();
        pjp.proceed();
        stopWatch.stop();
        log.info("execution type of method : {} is {} ",pjp.getSignature().getName(),stopWatch.getLastTaskTimeMillis());
        return o;
    }
}
