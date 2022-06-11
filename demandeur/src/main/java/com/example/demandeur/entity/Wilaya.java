package com.example.demandeur.entity;

import javax.persistence.*;
import java.util.Collection;
@Entity
public class Wilaya {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWilaya;
    @Column(nullable = false, length = 20)
    private String libelle;
   @OneToMany(mappedBy = "wilaya")
    private Collection<Commune> commune;
}
