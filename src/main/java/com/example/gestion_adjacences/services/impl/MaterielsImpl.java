package com.example.gestion_adjacences.services.impl;

import com.example.gestion_adjacences.Dao.EmployesDao;
import com.example.gestion_adjacences.Dao.MaterielsDao;
import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Materiels;
import com.example.gestion_adjacences.services.facade.MaterielsServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaterielsImpl implements MaterielsServices {

    @Autowired
    MaterielsDao materielsDao;


    @Override
    public Materiels AddMateriels(Materiels materiels) {

        return materielsDao.save(materiels);

    }

    @Override
    public List<Materiels> GetAll() {

        // TODO Auto-generated method stub

        return materielsDao.findAll();

    }

    @Override
    public Materiels UpdateMateriels(String seriel_number, Materiels materiels) {

        Materiels Materielscheck=materielsDao.findBySerial_number(seriel_number);

        if(Materielscheck==null)throw new RuntimeException("not found");

        Materielscheck.setSerial_number(materiels.getSerial_number());
        Materielscheck.setType(materiels.getType());


        return materielsDao.save(Materielscheck);

    }

    @Override
    public void Delete(String seriel_number) {

        Materiels Materielscheck=materielsDao.findBySerial_number(seriel_number);
        if(Materielscheck==null)throw new RuntimeException("not found");

        materielsDao.delete(Materielscheck);
    }
}
