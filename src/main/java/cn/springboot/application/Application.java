package cn.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.springboot.controller.HelloController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}