package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Problem;
import com.example.gestion_adjacences.services.facade.ProblemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/problems")
    public ResponseEntity<List<Problem>> getAllProblems() {
        List<Problem> problemList = problemServices.GetAll(); // Replace with the actual method call from your service

        if (problemList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(problemList);
        }
    }


    @DeleteMapping
    void DeleteProblem (@PathVariable String problemName){

        problemServices.Delete(problemName);

    }


}

