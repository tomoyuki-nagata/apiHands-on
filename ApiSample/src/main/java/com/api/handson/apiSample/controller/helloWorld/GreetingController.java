package com.api.handson.apiSample.controller.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.handson.apiSample.dto.Greeting;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello," + name + "!!");
    }
}
