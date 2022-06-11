package com.example.demandeur.controller;

import com.example.demandeur.entity.Cv;
import com.example.demandeur.entity.Demandeur;
import com.example.demandeur.repo.CvRepo;
import com.example.demandeur.repo.DemandeurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class DemandeurController {

    @Autowired
    DemandeurRepo DemandeurRepo;

    @GetMapping("/demandeur/{id}")
    Demandeur getDemandeur(@PathVariable("id") Long idDemandeur) {
       Demandeur Demandeur = DemandeurRepo.findById(idDemandeur).get();
        return Demandeur;
    }

        @GetMapping("/demandeur")  //GET http://localhost:8081/api/demandeur?id=1
        public List<Demandeur> getDemandeurs() {
            return DemandeurRepo.findAll();
        }

        @PostMapping("/demandeur")  //POST http://localhost:8081/api/demandeur
        public Demandeur createNewDemandeur(@RequestBody Demandeur Demandeur) {
            return DemandeurRepo.save(Demandeur);
        }


        @PutMapping("/client/{id}")  //Put http://localhost:8081/api/demandeur/1
        public Demandeur updateDemandeur(@PathVariable(value = "id") Long idDemandeur,
                                   @RequestBody Demandeur Demandeur) {
            if (DemandeurRepo.findById(idDemandeur).isPresent()) {
                Demandeur.setIdDemandeur(idDemandeur);
                return DemandeurRepo.save(Demandeur);
            }
            return null;
        }
   // @GetMapping("/condidature/{id_offre}")  //GET http://localhost:8081/api/condidature?id_offre=1
 //   public List<Demandeur> getDemandeurs() {
    //    return DemandeurRepo.findAll();
  //  }

}
