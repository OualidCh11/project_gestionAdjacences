package com.example.gestion_adjacences.services.impl;

import com.example.gestion_adjacences.Dao.ProblemDao;
import com.example.gestion_adjacences.bean.Problem;
import com.example.gestion_adjacences.services.facade.ProblemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemImpl implements ProblemServices{

    @Autowired
    ProblemDao problemDao;


    @Override
    public Problem AddProblem(Problem problem) {
        return problemDao.save(problem);
    }

    @Override
    public List<Problem> GetAll() {
        return problemDao.findAll();
    }

    @Override
    public void Delete(String name_problem) {

        Problem problemcheck=problemDao.findByName_problem(name_problem);
        if(problemcheck==null)throw new RuntimeException("Not found");

        problemDao.delete(problemcheck);

    }
}
