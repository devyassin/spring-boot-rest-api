package com.restApi.RestAPI.hellowrold;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "hello-world/{name}")
    public String getHello(@PathVariable String name){
        return "hello "+name;
    }
}
