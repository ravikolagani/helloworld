package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.crypto.Data;

@SpringBootApplication
@ComponentScan({"com.example.helloworld.controller"})
public class HelloworldApplication {

	@Bean
	public DataObject setDataObject(){
		return new DataObject("Ravi");
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
