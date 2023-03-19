package com.example.helloworld2023;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    private final HelloWorldForm helloWorldForm = new HelloWorldForm();
    private final  HelloWorldService helloWorldService =new HelloWorldService();

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
