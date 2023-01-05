package com.example.project;

import com.example.project.entities.PatientDetails;
import com.example.project.services.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	@Autowired
	private MongoTemplate mt;
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//mt.insert(new PatientDetails(1,"rames",98263));
	}
}
