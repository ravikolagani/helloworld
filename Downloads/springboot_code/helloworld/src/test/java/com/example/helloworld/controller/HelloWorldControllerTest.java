package com.example.helloworld.controller;

import com.example.helloworld.DataObject;
import org.junit.Test;

import static org.junit.Assert.*;


public class HelloWorldControllerTest {


    @Test
    public void shouldTestTheDataObjectOutput() throws Exception {
        DataObject dataObject = new DataObject("Ravi");

        HelloWorldController helloWorldController = new HelloWorldController(dataObject);

        assertEquals("Ravi", helloWorldController.getData().toString());
    }
}