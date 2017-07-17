package com.ipr.demo.aopservice.passaopservice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;

/**
 * Created by shiyang on 2017/7/12.
 */
public class PassAopService {
    public Object pass(ProceedingJoinPoint point) throws Throwable {
        System.out.println("前置---");
        Object obj=point.proceed();
        System.out.println("后置---");
        return obj;
 }
}
