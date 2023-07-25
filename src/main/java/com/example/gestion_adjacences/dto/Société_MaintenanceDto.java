package com.example.gestion_adjacences.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Société_MaintenanceDto {

    private Long id;
    private String name_societe;
    private String email;
    private String number_phone;
    private List<MaterielsDto>materielsDtos;
}
