package com.example.gestion_adjacences.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterielsResponse {

    private long id;
    private String type;
    private String serialNumber;
}
