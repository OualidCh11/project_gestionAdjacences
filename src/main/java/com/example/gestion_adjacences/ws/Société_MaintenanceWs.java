package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Société_Maintenance;
import com.example.gestion_adjacences.services.facade.Société_MaintenanceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/v1")
public class Société_MaintenanceWs {


    @Autowired
    Société_MaintenanceServices société_maintenanceServices;


    @PostMapping
    Société_Maintenance AddSociété_Maintenance(@RequestBody Société_Maintenance société_maintenance) {

        return société_maintenanceServices.AddSociété_Maintenance(société_maintenance);

    }


    @GetMapping
    List<Société_Maintenance> GetAll(){

        return société_maintenanceServices.GetAll();

    }


    @PutMapping(path = "/{id}")
    Société_Maintenance UpdateSociété_Maintenance(@RequestBody Société_Maintenance sociétéMaintenance,@PathVariable Long id){

        return société_maintenanceServices.UpdateSociété_Maintenance(id,sociétéMaintenance);

    }


    @DeleteMapping(path = "/{id}")
    void DeleteSociété_Maintenance(@PathVariable Long id){

        société_maintenanceServices.Delete(id);

    }


}







