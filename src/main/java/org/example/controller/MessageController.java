package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    //
    @GetMapping
    public String message() {
        //
        return "message";
    }

    @GetMapping("/ok")
    public ResponseEntity<?> ok() {
        //
        return ResponseEntity.ok("hello");
    }


    @GetMapping("/error")
    public ResponseEntity<?> error() {
        //
        return ResponseEntity.badRequest().body("hello");
    }

    @GetMapping("/list")
    public ResponseEntity<?> queryList() {
        //
        return ResponseEntity.status(11).body(List.of("hello", "my", "name"));
    }
}
