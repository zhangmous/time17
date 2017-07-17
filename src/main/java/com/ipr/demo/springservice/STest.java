package com.ipr.demo.springservice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shiyang on 2017/7/11.
 */
public class STest {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-a.xml","spring/spring_c.xml");
        // 转为接口不然会有错 原因：代理类与实现类是同级关系 强转有错
         ISayHelloService sayHello= (ISayHelloService) context.getBean("hello");
         String str=sayHello.esSayHello("zhangmou");
         System.out.println(str);
         System.out.println("____________________________");
         sayHello.sayHello();
    }
}
