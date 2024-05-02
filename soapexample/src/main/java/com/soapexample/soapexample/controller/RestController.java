package com.soapexample.soapexample.controller;

import com.soapexample.soapexample.service.ExampleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("restController/")
public class RestController {
    ExampleService exampleService;

    public RestController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("getMessage")
    public String getMessage(){
      return  exampleService.getMessage();

    }
}
