package com.soy.ebpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive";
    }
}
