package com.example.demandeur.entity;

import javax.persistence.*;
@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpecialite;
    @Column(nullable = false, length = 20)
    private String libelle;
    @OneToOne
    private Diplomes diplome;
}
