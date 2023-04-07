package com.bridgelabz.springdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String message(){
        return "Hello World";
    }
    @RequestMapping(value = "/queryparam",method = RequestMethod.GET)
    public String massage1(@RequestParam String message){
        return message;
    }

}
