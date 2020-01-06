package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class HomeController {
    @Value("${app.version}")
    private String appVersion;


    @GetMapping
    @RequestMapping("/")
    public Map home(){
       Map map = new HashMap<String, String>();
       map.put("App Version", appVersion);
       return map;
    }
}
