package com.example.demo;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.controller.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MainController.class})
@EntityScan(basePackages = {"com.example.vo"})
@EnableJpaRepositories(basePackages = {"com.example.repository"})
public class SimplilearnSchoolApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/SchoolApp");
		SpringApplication.run(SimplilearnSchoolApplication.class, args);
	}
	
}
