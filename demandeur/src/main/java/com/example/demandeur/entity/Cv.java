package com.example.demandeur.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cv")
public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCv;

    @Column(unique = true,length = 10)
    private int NumTel;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Enumerated(EnumType.STRING)
    private PermisDeConduit Permis;

    @Enumerated(EnumType.STRING)
    private SituationFam SituationFamiliale;

    private  boolean Handicap;

    @Enumerated(EnumType.STRING)
    private Sexe SituationMilitaire;

    private String adresse;

    @JsonIgnore
    @ManyToMany(mappedBy = "cv", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Collection<Diplomes> Diplomes;
    @JsonIgnore
    @ManyToMany(mappedBy = "cv")
    private Collection<Langues> Langues;

    @JsonIgnore
    @ManyToMany(mappedBy = "cv")
    private Collection<NiveauxQualification> Niveaux;

    @JsonIgnore
    @ManyToMany(mappedBy = "cv")
    private Collection<FormationPro> FormationPro;

    @ManyToMany(mappedBy = "cv")
    private Collection<Condidature> condidature;

    @JsonIgnore
    @OneToOne
    private Demandeur Demandeur;
}