package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.entities.PatientDetails;
import com.example.project.services.PService;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private PService bioService;

    @GetMapping("/connectivity")
    public String connectivity(){
        return "Connected Successfully";
    }

    @GetMapping("/Biodata")
    public List<PatientDetails> getBiodata(){
        return bioService.getBiodata();
    }

    @GetMapping("/Biodatabyid")
    public List<PatientDetails> getBiodatabyid(long id)
    {
        return bioService.getBiodatabyid(id);
    }

    @GetMapping("/addBiodata")
    public String addBiodata(String Pname, long Cno) {return bioService.addBiodata(Pname, Cno);}
}
