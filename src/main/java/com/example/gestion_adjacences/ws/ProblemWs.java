package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Problem;
import com.example.gestion_adjacences.services.facade.ProblemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProblemWs {


    @Autowired
    ProblemServices problemServices;


    @PostMapping
    Problem AddProblem(@RequestBody Problem problem){

        return problemServices.AddProblem(problem);

    }


    @GetMapping
    List<Problem> GetAll(){

        return problemServices.GetAll();

    }


    @DeleteMapping
    void DeleteProblem (@PathVariable String name_Problem){

        problemServices.Delete(name_Problem);

    }


}

