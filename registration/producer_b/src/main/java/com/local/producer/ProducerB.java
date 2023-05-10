package com.local.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerB {

	public static void main(String[] args) {
		SpringApplication.run(ProducerB.class, args);
	}

}
