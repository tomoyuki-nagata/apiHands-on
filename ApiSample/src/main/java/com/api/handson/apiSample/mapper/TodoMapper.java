package com.api.handson.apiSample.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.api.handson.apiSample.dto.Todo;

@Mapper
public interface TodoMapper {
    List<Todo> findAll();

    void insert(@Param("title") String title,
            @Param("deadline") LocalDate deadline,
            @Param("note") String note,
            @Param("isComplete") Boolean isComplete);

    void completed(@Param("id") Integer id);
}
