package com.example.gestion_adjacences.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.MappedByteBuffer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

@Entity
public class Materiels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "employes_id")
    private Employes employes;

    @ManyToOne
    @JoinColumn(name ="id_société_maintenance")
    private Société_Maintenance société_maintenance;

}
