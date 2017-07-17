package com.ipr.demo.springservice;

/**
 * Created by shiyang on 2017/7/11.
 */
public class SayHelloImpl implements ISayHelloService {

    private  String  Mes;
    private  int age;

    public SayHelloImpl(String mes) {
        Mes = mes;
    }

    public SayHelloImpl(String mes, int age) {
        Mes = mes;
        this.age = age;
    }
    public String sayHello() {
        return Mes;
    }
    public String esSayHello(String name){
        System.out.println("1");
        return name+" "+Mes+":"+age;

    }
}
