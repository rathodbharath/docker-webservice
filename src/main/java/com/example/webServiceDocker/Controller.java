package com.example.webServiceDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    Resource rs =  new Resource("Bharath");

    @GetMapping(path = "/docker/getName")
    public String getAuthorName(){

        return rs.getName();

    }

}
