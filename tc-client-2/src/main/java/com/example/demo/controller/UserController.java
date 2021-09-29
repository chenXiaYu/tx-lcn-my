package com.example.demo.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/add/{name}")
    @Transactional
    @LcnTransaction
    public String  add(@PathVariable(name = "name") String name){
        User user = new User();
        user.setName("t2_"+name);
        userMapper.add(user);
       // System.out.println(1/0);
        return "success";
    }
}
