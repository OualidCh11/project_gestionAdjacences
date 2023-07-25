package com.example.gestion_adjacences.Dao;

import com.example.gestion_adjacences.bean.Materiels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielsDao extends JpaRepository<Materiels , Long> {

    Materiels findBySerial_number(String serial_number);
}
