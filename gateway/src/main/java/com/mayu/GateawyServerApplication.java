package com.mayu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateawyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateawyServerApplication.class, args);
	}

}
