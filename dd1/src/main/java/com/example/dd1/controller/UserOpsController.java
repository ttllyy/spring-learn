package com.example.dd1.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserOpsController {

    private static final Logger logger = LoggerFactory.getLogger(UserOpsController.class);

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    String ping() {

        logger.warn("user warn ping.....................{}", "xxx");
        logger.info("user info ping.....................{}", "xxx");
        int a[] = {1, 2, 3};
        for (int x: a) {
            logger.info("user foreach ping.....................{}", x);
        }

        for(int i = 0; i < 1000; i++) {
            logger.info("user for ping.....................{}", i);
        }
        String out = "user ping ok";
        return out;
    }



}
