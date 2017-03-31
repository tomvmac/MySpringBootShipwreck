package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "It really works!";
    }

}
