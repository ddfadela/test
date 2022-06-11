package com.example.demandeur.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Condidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCondidature;

    @Column(nullable = false, length = 20)
    private String libelle;
    @ManyToMany
    private Collection<Cv> cv;


}
