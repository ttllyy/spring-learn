package com.example.dd1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



//如果没有传入参数,则默认是"zhangsan".
//
//        但是在传递参数的时候如果是url?userName=zhangsan&userName=wangwu时怎么办呢?
//
//        其实在实际roleList参数入参的数据为“zhangsan,wangwu”，即多个数据之间使用“，”分割；我们应该使用如下方式来接收多个请求参数：
//
//
//
//        复制代码
//public String requestparam8(@RequestParam(value="userName") String []  userNames)
//        或者是:
//public String requestparam8(@RequestParam(value="list") List<String> list)
//
//@RequestMapping(value="/users/{userId}/topics/{topicId}")
//public String test(   @PathVariable(value="userId") int userId,    @PathVariable(value="topicId") int topicId)


//@CookieValue用于将请求的Cookie数据映射到功能处理方法的参数上。
//
//public String test(@CookieValue(value="JSESSIONID", defaultValue="") String sessionId)
//        如上配置将自动将JSESSIONID值入参到sessionId参数上，defaultValue表示Cookie中没有JSESSIONID时默认为空。
//
//public String test2(@CookieValue(value="JSESSIONID", defaultValue="") Cookie sessionId)
//        传入参数类型也可以是javax.servlet.http.Cookie类型
//
//        测试代码在CookieValueTypeController中。@CookieValue也拥有和@RequestParam相同的三个参数，含义一样。



//@RequestHeader用于将请求的头信息区数据映射到功能处理方法的参数上。
//
//@RequestMapping(value="/header")
//public String test(
//@RequestHeader("User-Agent") String userAgent,
//@RequestHeader(value="Accept") String[] accepts)



/**
 * Created by qiaoyang on 2018/7/15.
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(@RequestParam(value = "h", required = false, defaultValue = "qy") String input) {
        log.info("info test.....................");
        log.warn("warn test.....................");
        String out = "index for " + input;
        System.out.println(out);
        return out;
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String testIndex(@RequestParam(value = "h", required = false, defaultValue = "qy") String input) {
        String out = "test for " + input;
        System.out.println(out);
        return out;
    }

}
