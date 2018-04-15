package com.example.helloworld;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DataObject {

    private String name;

    public DataObject(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return  name;
    }
}
