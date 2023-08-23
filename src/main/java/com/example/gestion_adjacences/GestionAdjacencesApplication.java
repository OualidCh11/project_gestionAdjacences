package com.example.gestion_adjacences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.gestion_adjacences.bean")
@EnableJpaRepositories(basePackages = "com.example.gestion_adjacences.Dao")
public class GestionAdjacencesApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestionAdjacencesApplication.class, args);
    }

}
