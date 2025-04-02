package com.edipof.simple_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

}

@RestController
@RequestMapping("/info")
class InfoController {

	@GetMapping
	public String getInfo() {
		return "{\"name\": \"Simple API\", \"version\": \"1.0.0\"}";
	}
}
