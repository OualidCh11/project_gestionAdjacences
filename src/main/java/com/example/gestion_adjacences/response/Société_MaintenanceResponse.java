package com.example.gestion_adjacences.response;

import com.example.gestion_adjacences.dto.MaterielsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Société_MaintenanceResponse {

    private Long id;
    private String name_societe;
    private String email;
    private String number_phone;
    private List<MaterielsDto> materielsDtos;

}
