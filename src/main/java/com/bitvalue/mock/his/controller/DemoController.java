package com.bitvalue.mock.his.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/echo")
    public String echo(String echo) {
        return System.currentTimeMillis() + " > " + echo;
    }

}
