package com.example.demandeur.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
public class FormationPro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormationPro;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;

     private int periode ;
    @Column(nullable = false, length = 20)
    private String libelle;

    @ManyToMany
    private Collection<Cv> cv;
}
