package com.prode5digos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> welcome(@PathVariable String name) {
        String message = "hello " + name + ", welcome!";
        return ResponseEntity.ok(message);
    }

}
