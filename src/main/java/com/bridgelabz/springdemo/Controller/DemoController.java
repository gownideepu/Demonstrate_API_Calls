package com.bridgelabz.springdemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message() {
        return "Hello World";
    }

    @RequestMapping(value = "/queryparam", method = RequestMethod.GET)
    public String message1(@RequestParam String message) {
        return message;
    }

    @RequestMapping(value = "/path/{message}", method = RequestMethod.GET)
    public String message2(@PathVariable String message) {
        return message;
    }
}