package com.example.td;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GestionMedicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionMedicationApplication.class, args);
	}

}
