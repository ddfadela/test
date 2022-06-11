package com.example.demandeur.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="Demadeur")
public class Demandeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDemandeur;
    private  String nom;
    private String prenom;
    private String email;
    private String password;
    @JsonIgnore
    @OneToOne
    private Cv cv;
}
