package com.suleesulee.MAKDUCKdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MakducKdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakducKdiscoveryApplication.class, args);
	}

}
