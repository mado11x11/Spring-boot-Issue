package com.example.helloworld2023;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloWorldService {
    private static final String url = "https://www.jma.go.jp/bosai/forecast/data/overview_forecast/130000.json";
    private  final RestTemplate restTemplate;

    public HelloWorldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public HelloWorldForm response() {
        return  restTemplate.getForObject(url, HelloWorldForm.class);
    }
}
