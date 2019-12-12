package com.abhi.spring.edu.springboot.api.basic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseStatusController {
    @RequestMapping(value = "/ok")
    @ResponseStatus(HttpStatus.OK)
    public String ok() {
        return "Response status should be 200";
    }

    @RequestMapping("/notFound")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound() {
        return "Response status should be 404";
    }

    @RequestMapping("/badRequest")
    @ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid, also I don't like you ;)")
    public String badRequest() {
        return "Response status should be 404";
    }
}
