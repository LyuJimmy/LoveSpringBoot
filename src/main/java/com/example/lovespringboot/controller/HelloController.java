package com.example.lovespringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 软件工程10班 吕俊铭
 * @create 2021-07-30 22:48
 * Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "FUCK YOu";
    }
}
