package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.cg")

public class SpringwithJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringwithJPA.class, args);
	
	}

}
