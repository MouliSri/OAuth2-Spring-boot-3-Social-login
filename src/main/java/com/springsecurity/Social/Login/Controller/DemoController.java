package com.springsecurity.Social.Login.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secured")
public class DemoController {


    @GetMapping
    public ResponseEntity<String> GetAuthroizedApiCall(){
        return ResponseEntity.ok("Im secured Api you cannot acces without permission");
    }
}
