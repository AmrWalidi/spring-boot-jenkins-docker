package com.amrwalidi.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "Hello  from spring boot";
    }

}
