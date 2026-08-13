package com.example.HolaMundoV1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class HolaMundoV1Controller {
    @GetMapping
    public String HolaMundo(){
        return "hola mundo v1.0.0";
    }

    @PostMapping
    public String HolaMundoPost(){
        return "hola mundo v1.1.0";
    }
}
