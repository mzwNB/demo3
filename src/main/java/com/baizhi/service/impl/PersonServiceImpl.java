package com.baizhi.service.impl;

import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;
    @Override
    public List<Person> selcetAll() {

        return personDao.selectAll();
    }
}
