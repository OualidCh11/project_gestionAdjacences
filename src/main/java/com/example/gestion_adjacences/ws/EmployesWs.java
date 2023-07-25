package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.services.facade.EmployesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployesWs {

    @Autowired
    EmployesServices employesServices;

    @PostMapping
    Employes Addemployes(@RequestBody Employes employes){

        return employesServices.AddEmployes(employes);

    }

    @GetMapping
    List<Employes> GetAll(){

        return employesServices.GetAll();

    }

    @PutMapping(path = "/{id}")
    Employes Updateemployes(@RequestBody Employes employes,@PathVariable Long id){

        return employesServices.UpdateEmployes(id ,employes);

    }

    @DeleteMapping(path = "/{id}")
    void DeleteEmployes(@PathVariable Long id){

        employesServices.Delete(id);

    }

}
