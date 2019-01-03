package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
@RequestMapping("/demo")
public class DemoController {
    @ResponseBody
    @RequestMapping(method = GET)
    public String demo() {
        return "hi";
    }
}
