package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HelleClient {
    private String version;
    private IHello helloService;
    public void showVersion() {
        System.out.println("Version is " + getVersion());
    }
    public void textHello() {
        helloService.sayHello();
    }
    /**setter和getter 法是必 可少的，Spring IoC使 它们对属性字段进 访问*/ public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public IHello getHelloService() {
        return helloService;
    }
    public void setHelloService(IHello helloService) {
        this.helloService = helloService;
    }
}