package com.practice.Services;

import com.practice.Services.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServicesApplication.class, args);
	}

	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public void run(String... args) throws Exception {
//		Service service1 = new Service("cleaning", "we will clean your house fast and cheap", 200D);
//		serviceRepository.save(service1);
//
//		Service service2 = new Service("PC Repair", "Professional PC repair services", 150.0);
//		serviceRepository.save(service2);
//
//		Service service3 = new Service("Gardening", "We will make your garden beautiful", 250.0);
//		serviceRepository.save(service3);
	}
}
