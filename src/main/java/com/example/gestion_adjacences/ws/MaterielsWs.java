package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Materiels;
import com.example.gestion_adjacences.services.facade.MaterielsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class MaterielsWs {

    @Autowired
    MaterielsServices materielsServices;

    @PostMapping
    Materiels AddMateriels(@RequestBody Materiels materiels){

        return materielsServices.AddMateriels(materiels);

    }

    @GetMapping
    List<Materiels> GetAll(){

        return materielsServices.GetAll();

    }

    @PutMapping
    Materiels UpdateMateriels(@RequestBody Materiels materiels,@PathVariable String serial_number){

        return materielsServices.UpdateMateriels(serial_number,materiels);

    }

    @DeleteMapping
    void DeleteMateriels(@PathVariable String serial_number){

        materielsServices.Delete(serial_number);

    }

}
