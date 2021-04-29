package com.api.handson.apiSample.controller.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.handson.apiSample.dto.Todo;
import com.api.handson.apiSample.mapper.TodoMapper;

@RestController
public class TodoRegisterController {
    @Autowired
    private TodoMapper todoMapper;

    @PostMapping("todo")
    @Transactional
    public void register(@RequestBody Todo todo) {
        todoMapper.insert(todo.getTitle(), todo.getDeadline(), todo.getNote(), todo.getIsComplete());
    }

}
