package com.example.demandeur.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class NiveauxQualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNiveauxQ;
    @Column(nullable = false, length = 20)
    private String libelle;
    @ManyToMany
    private Collection<Cv> cv;

}
