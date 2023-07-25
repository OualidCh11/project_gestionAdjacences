package com.example.gestion_adjacences.services.facade;

import com.example.gestion_adjacences.bean.Employes;

import java.util.List;

public interface EmployesServices {

    Employes AddEmployes(Employes employes);

    List<Employes> GetAll();

    Employes UpdateEmployes(Long id,Employes employes);

    void Delete(Long id);

}
