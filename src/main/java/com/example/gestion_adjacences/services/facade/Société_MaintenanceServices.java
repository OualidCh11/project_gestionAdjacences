package com.example.gestion_adjacences.services.facade;


import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Société_Maintenance;

import java.util.List;

public interface Société_MaintenanceServices {

    Société_Maintenance AddSociété_Maintenance(Société_Maintenance société_maintenance);

    List<Société_Maintenance> GetAll();

    Société_Maintenance UpdateSociété_Maintenance(Long id,Société_Maintenance société_maintenance);

    void Delete(Long id);
}
