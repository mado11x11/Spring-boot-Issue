package com.example.helloworld2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {
    @Autowired
    private static final String url = "https://www.jma.go.jp/bosai/forecast/data/overview_forecast/130000.json";
    private static final RestTemplate restTemplate = new RestTemplate();
    public HelloWorldForm response() {
        return  restTemplate.getForObject(url, HelloWorldForm.class);
    }
}
