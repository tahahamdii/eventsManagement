package com.example.eventsmanagement.repositories;

import com.example.eventsmanagement.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
}
