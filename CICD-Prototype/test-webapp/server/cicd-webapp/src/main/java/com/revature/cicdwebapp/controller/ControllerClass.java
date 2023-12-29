package com.revature.cicdwebapp.controller;

import com.revature.cicdwebapp.Dto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@CrossOrigin
public class ControllerClass {

    @GetMapping("/ping")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Dto pingPong() {
        return new Dto("pong!");
    }

    @GetMapping("/marco")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Dto marcoPolo() {
        return new Dto("polo!");
    }
}
