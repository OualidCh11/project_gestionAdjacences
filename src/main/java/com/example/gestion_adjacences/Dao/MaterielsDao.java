package com.example.gestion_adjacences.Dao;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterielsDao extends JpaRepository<Materiels,Long> {

    Materiels findByserialNumber(String serialNumber);
    List<Materiels> findById(Employes employes);
}
