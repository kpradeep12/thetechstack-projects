package net.thetechstack.livespadesscore.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    private String hello() {
        return "Hello " + new Date();
    }
}
