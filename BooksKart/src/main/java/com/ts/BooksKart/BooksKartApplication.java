package com.ts.BooksKart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.dao")
@EntityScan("com.model")
@SpringBootApplication(scanBasePackages="com")
public class BooksKartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksKartApplication.class, args);
	}
}
