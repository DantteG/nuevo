package com.dantte_011d.springboot.jpa.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;     

import com.dantte_011d.springboot.jpa.demo.repositories.PersonRepository;                           

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private PersonRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		//List<person> persons = (List<person>) repository.findAll();
		List<person> persons = (List<person>) repository.findByLenguajesProgramacion("Java");
		persons.stream().forEach(person ->{
			System.out.println(person);
		});
		
	}

}
