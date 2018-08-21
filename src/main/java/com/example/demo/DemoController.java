package com.example.demo;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String get(DemoForm form) {
        logger.info("get request acepted.");
        return "demo";
    }

    @PostMapping
    public String post(@Valid DemoForm form, BindingResult result) {
        logger.info("post request acepted.");
        result.getFieldErrors().forEach(e -> logger.info("field:{},error:{}", e.getField(), e.getDefaultMessage()));
        return "demo";
    }
}
