package com.example.jsonlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String index() {
        log.info("This is my message");
        return "Greetings from Spring Boot for Json Logger!";
    }

}
