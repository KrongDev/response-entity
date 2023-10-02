package org.example.controller;

import org.example.model.CustomResponse;
import org.example.model.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    //
    @GetMapping
    public String message() {
        //
        return "message";
    }

    @GetMapping("/ok")
    public CustomResponse<ResponseBody<?>> ok() {
        //
        return CustomResponse.ok(ResponseBody.ok("Hello"));
    }

    @GetMapping("/fail")
    public CustomResponse<ResponseBody<?>> fail() {
        //
        return CustomResponse.internalServerError(ResponseBody.fail(401, "shit", null));
    }


//    @GetMapping("/error")
//    public CustomResponse<?> error() {

//        return CustomResponse.badRequest().body("hello");
//    }

//    @GetMapping("/list")
//    public ResponseEntity<?> queryList() {

//        return ResponseEntity.status(11).body(List.of("hello", "my", "name"));
//    }
}
