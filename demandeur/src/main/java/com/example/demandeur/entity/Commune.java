package com.example.demandeur.entity;

import javax.persistence.*;

@Entity
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommune;
    @Column(nullable = false, length = 20)
    private String libelle;
    @ManyToOne
    @JoinColumn(name="idWilaya")
    private  Wilaya wilaya ;

}
