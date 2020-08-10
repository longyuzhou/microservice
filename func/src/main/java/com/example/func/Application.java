package com.example.func;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ApplicationRunner init(FuncRepository funcRepository) {
		return args -> {
			funcRepository.save(new Func("用户", "users"));
			funcRepository.save(new Func("角色", "roles"));
			funcRepository.save(new Func("功能", "funcs"));
		};
	}

}
