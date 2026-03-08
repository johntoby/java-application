package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class RandomController {
    
    @GetMapping("/")
    public String getRandomNumber() {
        return "<h1>Random Number: " + new Random().nextInt(1000) + "</h1>";
    }
}
