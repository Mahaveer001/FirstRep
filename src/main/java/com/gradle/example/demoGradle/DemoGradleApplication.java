package com.gradle.example.demoGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleApplication.class, args);
		
		for (int i=0;i<10;i++)
			System.out.println("hi "+i);
	}
}
