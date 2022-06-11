package com.example.demandeur.repo;

import com.example.demandeur.entity.Demandeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

public interface DemandeurRepo extends JpaRepository<Demandeur,Long> {
}
