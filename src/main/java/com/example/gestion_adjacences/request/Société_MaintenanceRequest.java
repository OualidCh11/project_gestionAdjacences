package com.example.gestion_adjacences.request;

import com.example.gestion_adjacences.dto.MaterielsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Société_MaintenanceRequest implements Serializable {


        private Long id;
        private String name_societe;
        private String email;
        private String number_phone;
        private List<MaterielsDto> materielsDtos;


}
