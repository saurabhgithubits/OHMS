package com.example.staff;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com.*"})
public class StaffdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffdetailsApplication.class, args);
	}
	@Bean
    public ModelMapper getModelMapper() {
       return  new ModelMapper();
    }
}
