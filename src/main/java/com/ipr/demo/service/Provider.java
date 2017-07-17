package com.ipr.demo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by shiyang on 2017/7/11.
 */
public class Provider {
    public static void main(String [] arsgs) throws IOException {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("dubbo/provider.xml");
        context.start();
        System.in.read();
    }
}
