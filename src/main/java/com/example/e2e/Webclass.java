package com.example.e2e;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webclass {

    @RequestMapping("/hello")
    public String ello()
    {

     return "hi";
    }
}
