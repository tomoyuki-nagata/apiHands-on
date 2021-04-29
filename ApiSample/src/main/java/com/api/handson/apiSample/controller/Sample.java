package com.api.handson.apiSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("sample")
    public String sample() {
        return "sample";
    }
}
