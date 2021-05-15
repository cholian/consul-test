package com.example.consultest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsulTestApplication {
	@Autowired
	private MyConfig myConfig;

	@GetMapping("/myConfig")
	public String getMyConfig() {
		return this.myConfig.getTeam();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsulTestApplication.class, args);
	}

}
