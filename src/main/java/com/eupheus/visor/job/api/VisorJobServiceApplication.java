package com.eupheus.visor.job.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
//@EnableDiscoveryClient
@EntityScan(basePackages = {"com.accelerate.visor"})
public class VisorJobServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisorJobServiceApplication.class, args);
	}

}
