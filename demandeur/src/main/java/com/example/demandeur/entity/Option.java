package com.example.demandeur.entity;

import javax.persistence.*;
@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOption;
    @Column(nullable = false, length = 20)
    private String libelle;
    @OneToOne
    private Diplomes diplome;
}
