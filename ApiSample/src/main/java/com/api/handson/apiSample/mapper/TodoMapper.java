package com.api.handson.apiSample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.handson.apiSample.dto.Todo;

@Mapper
public interface TodoMapper {
    List<Todo> findAll();
}
