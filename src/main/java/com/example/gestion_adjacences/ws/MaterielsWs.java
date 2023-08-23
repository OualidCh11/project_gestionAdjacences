package com.example.gestion_adjacences.ws;

import com.example.gestion_adjacences.bean.Employes;
import com.example.gestion_adjacences.bean.Materiels;
import com.example.gestion_adjacences.services.facade.MaterielsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MaterielsWs {

    @Autowired
    MaterielsServices materielsServices;

    @PostMapping("/materiels")  // Specify a unique path
    Materiels AddMateriels(@RequestBody Materiels materiels){
        return materielsServices.AddMateriels(materiels);
    }

    @GetMapping("/materiels")  // Specify a unique path
    public ResponseEntity<List<Materiels>> getAllMateriels() {
        // Implementation
        List<Materiels> materielsList = materielsServices.GetAll(); // Replace with the actual method call

        if (materielsList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(materielsList);
        }
    }

    @GetMapping("/all-materiels")  // Use a different path
    List<Materiels> GetAll(){
        return materielsServices.GetAll();
    }

    @PutMapping("/materiels/{serial_number}")  // Specify a unique path
    Materiels UpdateMateriels(@RequestBody Materiels materiels, @PathVariable String serial_number){
        return materielsServices.UpdateMateriels(serial_number, materiels);
    }

    @DeleteMapping("/materiels/{serial_number}")  // Specify a unique path
    void DeleteMateriels(@PathVariable String serial_number){
        materielsServices.Delete(serial_number);
    }
}