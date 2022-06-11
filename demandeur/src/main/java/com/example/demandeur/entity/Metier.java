package com.example.demandeur.entity;

import javax.persistence.*;

public class Metier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMetier;
    @Column(nullable = false, length = 20)
    private String libelle;

}
