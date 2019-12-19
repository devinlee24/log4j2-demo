package com.devinlee.log4j2demo.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.core.async.AsyncLoggerContextSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

    /**
     * 使用方式：
     * 1.org.slf4j.LoggerFactory
     * 2.@Slf4j注解(依赖lombok)
     */

    // private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/log")
    public void log(){

        log.info("测试INFO信息");
        log.error("测试ERROR信息");
        log.warn("测试WARN信息");
        // 查看是否为异步日志
        log.info("是否为异步日志：{}", AsyncLoggerContextSelector.isSelected());
    }
}
