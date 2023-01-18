package com.bhut.bhutapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class BhutApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BhutApiApplication.class, args);
	}

}
