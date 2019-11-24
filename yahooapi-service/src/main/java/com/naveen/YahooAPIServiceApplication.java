package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YahooAPIServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahooAPIServiceApplication.class, args);
	}

}
