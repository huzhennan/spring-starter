package com.example.demo.controller;

import com.example.demo.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhennan.hu on 18-2-3
 */
@Controller
public class HelloController {
    @Autowired
    private DbMapper dbMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello, world!" + dbMapper.getVersion();
    }
}
