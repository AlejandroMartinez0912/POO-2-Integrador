package com.unam.greenwave;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenwaveApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GreenwaveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Prueba de ejecución ");
	}
	

}
