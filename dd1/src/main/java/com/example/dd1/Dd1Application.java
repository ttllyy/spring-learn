package com.example.dd1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


//@SpringBootApplication
@SpringBootApplication(exclude = {
//        MongoAutoConfiguration.class,
//        MongoDataAutoConfiguration.class,
        RedisAutoConfiguration.class,
        RedisRepositoriesAutoConfiguration.class})
public class Dd1Application {
    public static void main(String[] args) {
        System.out.println("begin main...");
        SpringApplication.run(Dd1Application.class, args);
    }
}
