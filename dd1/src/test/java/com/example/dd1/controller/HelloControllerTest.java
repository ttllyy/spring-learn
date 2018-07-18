package com.example.dd1.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class HelloControllerTest {

    @Resource
    private HelloController helloc;

    //这个对象是运行在web环境的时候加载到spring容器中
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws Exception {
        System.out.println("Hello Set up...........");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Hello TearDown up...........");
    }

    @Test
    public void index() {
        System.out.println("index");
    }

    @Test
    public void testIndex() {
        System.out.println("testIndex");
        String context = testRestTemplate.getForObject("/test/test", String.class);
        Assert.assertEquals("test for qy", context);
    }
}