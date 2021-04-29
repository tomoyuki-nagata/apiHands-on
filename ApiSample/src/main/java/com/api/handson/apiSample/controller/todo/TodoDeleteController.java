package com.api.handson.apiSample.controller.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.handson.apiSample.mapper.TodoMapper;

@RestController
public class TodoDeleteController {
    @Autowired
    private TodoMapper todoMapper;

    @DeleteMapping("todo/{id}")
    @Transactional
    public void completed(@PathVariable Integer id) {
        todoMapper.deleteById(id);
    }

}
