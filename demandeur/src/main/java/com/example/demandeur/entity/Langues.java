package com.example.demandeur.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Langues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLangues;
    @Column(nullable = false, length = 20)
    private String libelle;
    @ManyToMany
    private Collection<Cv> cv;
}
