package com.example.gestion_adjacences.Dao;

import com.example.gestion_adjacences.bean.Société_Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Société_MaintenanceDao extends JpaRepository<Société_Maintenance ,Long> {

    Société_Maintenance findByid(Long id);
}
