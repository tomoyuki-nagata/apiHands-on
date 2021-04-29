package com.api.handson.apiSample.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Todo {
    private Integer id;

    private String title;

    private LocalDate deadline;

    private String note;

    private Boolean isComplete;

    public Todo() {
        this(null, null, null, null, null);
    }

    public Todo(Integer id, String title, LocalDate deadline, String note, Boolean isComplete) {
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.note = note;
        this.isComplete = isComplete;
    }

}
