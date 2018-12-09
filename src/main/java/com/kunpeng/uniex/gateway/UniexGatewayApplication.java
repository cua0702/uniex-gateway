package com.kunpeng.uniex.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class UniexGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniexGatewayApplication.class, args);
	}

}
