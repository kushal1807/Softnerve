package com.example.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import com.example.project.entities.PatientDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PServiceImpl implements PService {
    @Autowired
    private MongoTemplate mt;

    @Override
    public List<PatientDetails> getBiodata() {
        Query query=new Query();
        return mt.find(query,PatientDetails.class);
    }

    @Override
    public List<PatientDetails> getBiodatabyid(long id) {

        List<PatientDetails> ans = new ArrayList<>();
//        for (PatientDetails b : ans) {
//            if (b.getPid() == id) {
//                ans.add(b);
//            }
//        }
        return ans;
    }

    @Override
    public String addBiodata(String Pname, long Cno) {
        long Pid = getBiodata().size() + 1;
        //list.add(new PatientDetails(Pid, Pname, Cno));
        mt.insert(new PatientDetails(Pid, Pname, Cno));
        return "Added Successfully";
    }

    @Override
    public void run(String... args) throws Exception {
        //mt.insert();
    }
}