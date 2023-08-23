package com.example.gestion_adjacences.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterielsDto {

    private long id;
    private String type;
    private String serialNumber;

}
