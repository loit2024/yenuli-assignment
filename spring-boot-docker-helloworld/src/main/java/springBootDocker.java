package com.example.springbootdockerhelloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello-world")
public class springBootDocker {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to LOLC";
    }
}

