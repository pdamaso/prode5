package com.prode5digos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prode")
public class ProdeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> prode() {
        String message = "prode page!";
        return ResponseEntity.ok(message);
    }
}
