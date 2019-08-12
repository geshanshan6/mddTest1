package com.example.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ac = new
                ClassPathXmlApplicationContext(
                new String[]{"demo/ioc/applicationContext.xml"});) {
            HelloClient helloClient = ac.getBean("helloClient",
                    HelloClient.class);
            helloClient.showVersion();//输出 Version is 1.4
            helloClient.textHello();//输出 say hello by text. }
        }
    }
}