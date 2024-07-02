package com.example.checkpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.checkpoint.repository")
@ComponentScan("com.example.checkpoint.*")
@EntityScan("com.example.checkpoint.model")
public class CheckpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckpointApplication.class, args);
	}
}
