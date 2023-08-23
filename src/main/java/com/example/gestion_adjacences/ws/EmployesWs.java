package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.services.facade.EmployesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/employes")
    public ResponseEntity<List<Employes>> getAllEmployes() {
        List<Employes> employesList = employesServices.GetAll(); // Replace with the actual method call from your service

        if (employesList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(employesList);
        }
    }

}
