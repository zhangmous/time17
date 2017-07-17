package com.ipr.demo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shiyang on 2017/7/11.
 */
public class Consumer {
    public  static  void main(String[] args){

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo/consumer.xml");
        context.start();
        IProvider iProvider=(IProvider) context.getBean("providerService");
        iProvider.showMsg();
        System.out.println("i know !");

    }
}
