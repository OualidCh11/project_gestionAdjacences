package com.example.gestion_adjacences.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Société_Maintenance {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_societe;
    private String email;
    private String number_phone;

    @OneToMany(mappedBy = "société_maintenance")
    private Collection<Materiels> materiels;



}
