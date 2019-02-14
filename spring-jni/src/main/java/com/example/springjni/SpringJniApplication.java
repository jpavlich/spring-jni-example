package com.example.springjni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJniApplication {
	static {
		System.loadLibrary("jniwrapper");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJniApplication.class, args);
	}

}
