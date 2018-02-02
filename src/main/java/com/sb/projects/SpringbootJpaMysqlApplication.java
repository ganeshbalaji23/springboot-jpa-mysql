package com.sb.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.sb.projects.repository")
@SpringBootApplication
public class SpringbootJpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaMysqlApplication.class, args);
	}
}
