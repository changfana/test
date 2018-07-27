package com.sinotrans.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 *
 * @auth  changfan
 * @date 2018-7-26
 * @time 16:23
 */
@EnableWebMvc
@Controller
@RequestMapping(value = "/user")
public class helloController {

    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        System.out.println("aaaaaaaaaaaa要疯啦！！！");
        return "sorry";
    }
}