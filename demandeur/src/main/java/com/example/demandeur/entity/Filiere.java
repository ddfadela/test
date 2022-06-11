package com.example.demandeur.entity;

import javax.persistence.*;
@Entity
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFiliere;
    @Column(nullable = false, length = 20)
    private String libelle;
    @OneToOne
    private Diplomes diplome;
}
