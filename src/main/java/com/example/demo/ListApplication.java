package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ent.PersonRepository;
import com.example.demo.list.menu;

@SpringBootApplication
public class ListApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository Data;
	public static void main(String[] args) {
		System.setProperty( "java.awt.headless", "false" );
		SpringApplication.run(ListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.setProperty( "java.awt.headless", "false" );
		new menu(Data);		
	}

}
