package com.restApi.RestAPI.Filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public Filters getFiltering(){
        return new Filters("value1","value2","value3");
    }
}
