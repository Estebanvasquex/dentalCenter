package com.company.centroOdontologico;

import dao.Database;
import model.Dentist;
import model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.DentistService;
import service.PatientService;

@SpringBootApplication
public class CentroOdontologicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentroOdontologicoApplication.class, args);

		Database.createTable();

		PatientService patientService = new PatientService();

		Patient patient1 = new Patient(1,"Esteban","Vásquez","esteban@gmail.com","123456","8063","calle56","diciembre12");

		patientService.save(patient1);


		DentistService dentistService = new DentistService();

		Dentist dentist1 = new Dentist(1,"Oscar","Henao","oscar@gmail.com","54321","987654321");
		Dentist dentist2 = new Dentist(2,"Victor","Perez","oscar@gmail.com","54321","987654321");

		dentistService.save(dentist1);
		dentistService.save(dentist2);


	}

}
