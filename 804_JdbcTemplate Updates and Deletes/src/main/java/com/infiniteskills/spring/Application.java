package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.RentalLocation;
import com.infiniteskills.spring.data.repositories.RentalLocationRepository;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);

		RentalLocation location = repo.findById(13);
		repo.delete(location);
		
//		RentalLocation location = repo.findById(5);
//		location.setName("Update Test");
//		
//		repo.update(location);
	}
	
}