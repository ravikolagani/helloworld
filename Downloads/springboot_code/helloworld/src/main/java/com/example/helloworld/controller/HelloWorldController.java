package com.example.helloworld.controller;


import com.example.helloworld.DataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private DataObject dataObject;

    @Autowired
    public HelloWorldController(DataObject dataObject){
        this.dataObject = dataObject;
    }

    @RequestMapping("/gethello")
    public DataObject getData(){
        System.out.println("Hello..!");
        return dataObject;
    }
}
