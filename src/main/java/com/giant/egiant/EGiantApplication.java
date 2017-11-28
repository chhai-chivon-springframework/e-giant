package com.giant.egiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.giant.egiant.models")
@EnableJpaRepositories(basePackages = "com.giant.egiant.repository")
@EnableAutoConfiguration
public class EGiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EGiantApplication.class, args);
	}
}
