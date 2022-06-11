package com.example.demandeur.controller;

import com.example.demandeur.entity.Condidature;
import com.example.demandeur.entity.Cv;
import com.example.demandeur.repo.CondidatureRepo;
import com.example.demandeur.repo.CvRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api")

public class CondidatureController {
    @Autowired
    CondidatureRepo CondidatureRepo;
    @PostMapping("/condidature")  //POST http://localhost:8081/api/condidature
    public Condidature createNewClient(@RequestBody Condidature Condidature) {
        return CondidatureRepo.save(Condidature);
    }


    @DeleteMapping("/condidature/{id}")   //Delete http://localhost:8081/api/condidature/1
    public String DeleteCondidature(@PathVariable(value = "id") Long idCondidature){
        if (CondidatureRepo.findById(idCondidature).isPresent()){
           CondidatureRepo.deleteById(idCondidature);
            return "condidature a supprimer";}
        return "the ID is not valid";
    }
}
