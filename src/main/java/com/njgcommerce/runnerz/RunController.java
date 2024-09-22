package com.njgcommerce.runnerz;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class RunController {
    @GetMapping("/hello")
    String home() {
        return "Hello World!";
    }
}
