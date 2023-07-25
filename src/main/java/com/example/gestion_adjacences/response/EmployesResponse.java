package com.example.gestion_adjacences.response;

import com.example.gestion_adjacences.dto.MaterielsDto;
import com.example.gestion_adjacences.dto.ProblemDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployesResponse {

    private long id;
    private String cin;
    private String first_name;
    private String last_name;
    private Date date_problem;
    private String email;
    private String password;
    private String service;
    private String numero_bureau ;
    private ProblemDto problemDto;
    private MaterielsDto materielsDto;

}
