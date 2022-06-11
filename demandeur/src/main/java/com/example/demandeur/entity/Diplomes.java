package com.example.demandeur.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Table(name = "Diplome")
@Data @AllArgsConstructor @NoArgsConstructor
public class Diplomes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiplome;
    private String lieu;
    private Date dateObtention;

    @ManyToMany
      private Collection<Cv> cv;

   @OneToOne(mappedBy = "diplome")
    private Specialite specialite;

    @OneToOne(mappedBy = "diplome")
    private Option option;

    @OneToOne(mappedBy = "diplome")
    private Filiere filiere;
}
