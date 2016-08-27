package com.prode5digos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> home() {
        String message = "home page!";
        return ResponseEntity.ok(message);
    }

}
