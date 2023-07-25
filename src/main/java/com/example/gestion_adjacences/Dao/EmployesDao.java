package com.example.gestion_adjacences.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion_adjacences.bean.Employes;


@Repository
public interface EmployesDao extends JpaRepository<Employes,Long> {

    Employes findByid(Long id);

}
