package com.example.gestion_adjacences.config;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Materiels;
import com.example.gestion_adjacences.bean.Problem;
import com.example.gestion_adjacences.bean.Société_Maintenance;
import com.example.gestion_adjacences.dto.EmployesDto;
import com.example.gestion_adjacences.dto.MaterielsDto;
import com.example.gestion_adjacences.dto.ProblemDto;
import com.example.gestion_adjacences.dto.Société_MaintenanceDto;
import org.modelmapper.ModelMapper;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Add mappings for Employes and EmployesDto
        modelMapper.createTypeMap(Employes.class, EmployesDto.class)
                .addMapping(Employes::getCin, EmployesDto::setCin)
                .addMapping(Employes::getDate_problem, EmployesDto::setDate_problem)
                .addMapping(Employes::getMateriels, EmployesDto::setMaterielsDto);

        // Add mappings for Materiels and MaterielsDto
        modelMapper.createTypeMap(Materiels.class, MaterielsDto.class)
                .addMapping(Materiels::getSerial_number, MaterielsDto::setSerial_number);


        // Add mappings for Problem and ProblemDto
        modelMapper.createTypeMap(Problem.class, ProblemDto.class)
                .addMapping(Problem::getName_problem, ProblemDto::setName_problem);


        // Add mappings for Société_Maintenance and Société_MaintenanceDto
        modelMapper.createTypeMap(Société_Maintenance.class, Société_MaintenanceDto.class)
                .addMapping(Société_Maintenance::getMateriels, Société_MaintenanceDto::setMaterielsDtos)
                .addMapping(Société_Maintenance::getName_societe, Société_MaintenanceDto::setName_societe);





        return modelMapper;
    }

}
