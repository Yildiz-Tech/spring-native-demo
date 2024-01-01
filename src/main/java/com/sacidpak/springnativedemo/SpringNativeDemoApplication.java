package com.sacidpak.springnativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringNativeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeDemoApplication.class, args);
	}

}
