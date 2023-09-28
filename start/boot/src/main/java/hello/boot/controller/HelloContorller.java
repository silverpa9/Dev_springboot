package hello.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {
    @GetMapping("/hello-spring")
    public String hello() {
        System.out.println("HelloContorller.hello");
        return "hello-spring!";
    }
}
