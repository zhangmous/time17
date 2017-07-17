package com.ipr.demo.redistest;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by shiyang on 2017/7/13.
 */
public class RedisJava {
    public static void main(String [] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("链接成功");
       /* System.out.println("服务"+jedis.ping());
        jedis.set("zhubajie","zhangmou");
        System.out.println("Value="+jedis.get("zhubajie"));*/
        // l-放在前面 R-放在后面 value-全部是当对象处理 7个对象
        /*jedis.lpush("taobao","水果","芒果","1");
        jedis.lpush("taobao","衣物","2");
        jedis.rpush("taobao","车","3");
        List<String> list=jedis.lrange("taobao",0,-1);
        for(String str:list){
            System.out.println(str.toString());
        }*/
        //获取所有的key 返回的是一个Set集合
        Set<String> setkeys= jedis.keys("*");
        Iterator iterator=setkeys.iterator();
        while (iterator.hasNext()){
             String str= (String) iterator.next();
            System.out.println(str);
        }

    }
}
