package com.example.agent.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public void init() {

    }

    @RequestMapping(value="/image", method = RequestMethod.POST)
    public String getImageName() {
        return null;
    }
}
