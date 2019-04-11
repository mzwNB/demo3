package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("demo3")
public class TestController {

    @RequestMapping("test")
    public Map test(){
        System.out.println("进来");
        Map map = new HashMap();
        map.put("flag",true);
        map.put("flag",false);
        System.out.println("出去");
        return map;
    }

}
