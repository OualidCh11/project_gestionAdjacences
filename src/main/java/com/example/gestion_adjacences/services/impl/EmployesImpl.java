package com.example.gestion_adjacences.services.impl;

import com.example.gestion_adjacences.Dao.EmployesDao;
import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.services.facade.EmployesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployesImpl implements EmployesServices {

    @Autowired
    EmployesDao employesDao;


    @Override
    public Employes AddEmployes(Employes employes) {

        return employesDao.save(employes);

    }

    @Override
    public List<Employes> GetAll() {

        // TODO Auto-generated method stub

        return employesDao.findAll();

    }

    @Override
    public Employes UpdateEmployes(Long id, Employes employes) {

        Employes employescheck=employesDao.findByid(id);

        if(employescheck==null)throw new RuntimeException("not found");

        employescheck.setCin(employes.getCin());
        employes.setFirst_name(employes.getFirst_name());
        employes.setLast_name(employes.getLast_name());
        employes.setNumero_bureau(employes.getNumero_bureau());
        employescheck.setDate_problem(employes.getDate_problem());
        employescheck.setEmail(employes.getEmail());
        employescheck.setPassword(employes.getPassword());
        employescheck.setService(employes.getService());



        return employesDao.save(employescheck);

    }

    @Override
    public void Delete(Long id) {

        Employes employescheck=employesDao.findByid(id);
        if(employescheck==null)throw new RuntimeException("not found");

        employesDao.delete(employescheck);
    }
}
