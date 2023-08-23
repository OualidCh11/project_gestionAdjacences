package com.example.gestion_adjacences.services.facade;

import com.example.gestion_adjacences.bean.Materiels;

import java.util.List;

public interface MaterielsServices {

    Materiels AddMateriels(Materiels materiels);

    List<Materiels> GetAll();

    Materiels UpdateMateriels(String serialNumber,Materiels materiels);

    void Delete(String serialNumber);
}
