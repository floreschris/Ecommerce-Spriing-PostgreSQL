package com.flowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class KyCEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyCEcommerceApplication.class, args);
	}

}
