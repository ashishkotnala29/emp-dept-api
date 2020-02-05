package com.jkt.empdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmpDeptApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDeptApiApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hi! Emp-Dept API";
	}
}
