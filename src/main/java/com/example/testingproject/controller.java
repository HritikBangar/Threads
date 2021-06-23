package com.example.testingproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class controller {

    @GetMapping("/test")
    ResponseEntity<Object> testFunction(){



        return new ResponseEntity<>("hrllo", HttpStatus.ACCEPTED);
    }

}
