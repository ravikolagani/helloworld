package com.example.helloworld.controller;


import com.example.helloworld.DataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private DataObject dataObject;

    @Autowired
    public HelloWorldController(DataObject dataObject){
        this.dataObject = dataObject;
    }

    public DataObject getData(){
        return dataObject;
    }
}
