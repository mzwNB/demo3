package com.baizhi.dao;

import com.baizhi.entity.Person;

import java.util.List;

public interface PersonDao {
    List<Person> selectAll();
}
