package com.example.gestion_adjacences.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cin;
    private String first_name;
    private String last_name;
    private Date date_problem;
    private String email;
    private String password;
    private String service;
    private String numero_bureau ;

    @OneToMany(mappedBy = "employes")
    private Collection<Materiels> materiels;

    @OneToMany(mappedBy = "employes")
    private Collection<Problem> problem;


}
