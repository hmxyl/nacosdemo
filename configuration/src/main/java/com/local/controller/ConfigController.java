package com.local.controller;

import com.local.bean.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2023/3/19
 * @description
 */
@RestController
public class ConfigController {
    @Autowired
    ConfigInfo configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo.getText() + ":" + configInfo.getCode();
    }
}