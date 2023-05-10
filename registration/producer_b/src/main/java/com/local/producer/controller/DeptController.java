package com.local.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String serverName;

    @GetMapping(value = "/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "服务名：" + serverName + "<br /> 端口号： " + serverPort + "<br /> 传入的参数：" + id;
    }


}