package com.ipr.demo.aopservice;

import com.ipr.demo.springservice.ISayHelloService;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by shiyang on 2017/7/11.
 */
    public class AopService {

    public void check() throws Throwable {
        System.out.println("checked");

    }

}
