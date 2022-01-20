package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGitApplication {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Hello Git!");
        System.out.println("修改1");
        System.out.println("修改2");
        System.out.println("修改3");
        System.out.println("修改4");
        System.out.println("tom第一次开发");
        System.out.println("干的不错");
        System.out.println("领导第二次修改");
        System.out.println("tom第一次修改");
        System.out.println("领导第三次修改");
    }
}
