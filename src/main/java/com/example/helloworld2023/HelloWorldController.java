package com.example.helloworld2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloWorldController {

    @Autowired
    private  HelloWorldService  helloWorldService;

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "hello world");
        return "hello-world";
    }

    @GetMapping("/weather")
    public String weather(Model model) {
        HelloWorldForm weatherRes = helloWorldService.response();
        model.addAttribute("weatherRes",weatherRes);
        return "weather";
    }
}
