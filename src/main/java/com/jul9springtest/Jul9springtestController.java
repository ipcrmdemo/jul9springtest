package com.jul9springtest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class Jul9springtestController {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
