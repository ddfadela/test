package com.example.demandeur.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompetence;

    @Column(nullable = false, length = 20)
    private String libelle;
    @Column(nullable = false, length = 20)
    private String description;

}
