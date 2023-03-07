package com.syc.modules.webtest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
