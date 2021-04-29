package com.api.handson.apiSample.controller.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.handson.apiSample.mapper.TodoMapper;
import com.api.handson.apiSample.dto.Todo;

@RestController
public class TodoController {
    @Autowired
    private TodoMapper todoMapper;

    @GetMapping("todo-list")
    public List<Todo> list() {
        List<Todo> todoList = todoMapper.findAll();
        return todoList;
    }

}
