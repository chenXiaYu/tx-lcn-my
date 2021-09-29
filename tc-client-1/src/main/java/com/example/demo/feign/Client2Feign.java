package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "TC-CLIENT-2")
public interface Client2Feign {

    @ResponseBody
    @RequestMapping("/add/{name}")
    public  String  add(@PathVariable(name = "name") String name);
}
