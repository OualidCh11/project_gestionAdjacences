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
    private String serial_number;

    @ManyToOne
    private Employes employes;

    @ManyToOne
    private Société_Maintenance société_maintenance;

}
