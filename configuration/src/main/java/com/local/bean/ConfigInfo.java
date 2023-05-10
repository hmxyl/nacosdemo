package com.local.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@RefreshScope
public class ConfigInfo {
    @Value("${config.text}")
    private String text;
    @Value("${config.code}")
    private String code;
    @Value("${config.message}")
    private String message;
}