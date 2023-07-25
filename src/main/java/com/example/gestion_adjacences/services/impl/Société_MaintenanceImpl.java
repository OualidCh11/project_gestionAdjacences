package com.example.gestion_adjacences.services.impl;

import com.example.gestion_adjacences.Dao.Société_MaintenanceDao;
import com.example.gestion_adjacences.bean.Société_Maintenance;
import com.example.gestion_adjacences.services.facade.Société_MaintenanceServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Société_MaintenanceImpl implements Société_MaintenanceServices {


    @Autowired
    Société_MaintenanceDao société_maintenanceDao;


    @Override
    public Société_Maintenance AddSociété_Maintenance(Société_Maintenance société_maintenance) {

        return société_maintenanceDao.save(société_maintenance);

    }


    @Override
    public List<Société_Maintenance> GetAll() {

        return société_maintenanceDao.findAll();

    }


    @Override
    public Société_Maintenance UpdateSociété_Maintenance(Long id, Société_Maintenance société_maintenance) {

        Société_Maintenance sociétéMaintenancecheck=société_maintenanceDao.findByid(id);

        if(sociétéMaintenancecheck==null)throw new RuntimeException("Not found");

        sociétéMaintenancecheck.setName_societe(société_maintenance.getName_societe());
        sociétéMaintenancecheck.setNumber_phone(société_maintenance.getNumber_phone());
        sociétéMaintenancecheck.setEmail(société_maintenance.getEmail());

        return société_maintenanceDao.save(sociétéMaintenancecheck);

    }


    @Override
    public void Delete(Long id) {

        Société_Maintenance sociétéMaintenancecheck=société_maintenanceDao.findByid(id);

        if(sociétéMaintenancecheck==null)throw new RuntimeException("Not found");

        société_maintenanceDao.delete(sociétéMaintenancecheck);

    }
}

