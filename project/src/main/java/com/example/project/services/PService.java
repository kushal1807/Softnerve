package com.example.project.services;

import com.example.project.entities.PatientDetails;
import org.springframework.boot.CommandLineRunner;

import java.util.List;


public interface PService extends CommandLineRunner {


    List<PatientDetails> getBiodata();

    List<PatientDetails> getBiodatabyid(long id);

    String addBiodata(String Pname, long Cno);


}
