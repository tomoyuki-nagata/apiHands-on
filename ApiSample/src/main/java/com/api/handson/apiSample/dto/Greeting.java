package com.api.handson.apiSample.dto;

import lombok.Getter;

public class Greeting {
    @Getter
    private final String content;

    public Greeting(String content) {
        this.content = content;
    }
}
