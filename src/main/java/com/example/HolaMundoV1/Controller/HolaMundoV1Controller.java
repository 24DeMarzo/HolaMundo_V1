package com.example.HolaMundoV1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping
public class HolaMundoV1Controller {
    @GetMapping
    public String HolaMundo(){
        return "hola mundo v1.0.0";
    }

    @PutMapping
    public String HolaMundoPut(@RequestBody String body){
        return "hola mundo v1.0.0 put: " + body;
    }
}
