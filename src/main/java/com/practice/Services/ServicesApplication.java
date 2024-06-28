package com.practice.Services;

import com.practice.Services.Entities.Service;
import com.practice.Services.Entities.User;
import com.practice.Services.Repositories.ServiceRepository;
import com.practice.Services.Repositories.UserRepository;
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
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("CleanDim", "Dim", "dim@example.com");
		userRepository.save(user1);
		Service service1 = new Service("cleaning", "we will clean your house fast and cheap", 200D, user1);
		serviceRepository.save(service1);

		User user2 = new User("TechGuy", "Alex", "alex@example.com");
		userRepository.save(user2);
		Service service2 = new Service("PC Repair", "Professional PC repair services", 150.0, user2);
		serviceRepository.save(service2);

		User user3 = new User("GardenPro", "Sarah", "sarah@example.com");
		userRepository.save(user3);
		Service service3 = new Service("Gardening", "We will make your garden beautiful", 250.0, user3);
		serviceRepository.save(service3);
	}
}
