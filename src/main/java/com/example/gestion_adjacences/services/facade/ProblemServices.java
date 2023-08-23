package com.example.gestion_adjacences.services.facade;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Problem;

import java.util.List;

public interface ProblemServices {

    Problem AddProblem(Problem problem);

    List<Problem> GetAll();

    void Delete(String problemName);
}
