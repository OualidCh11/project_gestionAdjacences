package com.example.gestion_adjacences.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemRequest implements Serializable {

    private long id;
    private String problemName;

}
