package com.example.RestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting greetingController(@RequestParam(value = "name" ,defaultValue = "World") String name){
        return new Greeting((int)counter.incrementAndGet(),String.format("Hello , %s",name));

    }
}
