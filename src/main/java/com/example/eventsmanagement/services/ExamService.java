package com.example.eventsmanagement.services;

import com.example.eventsmanagement.entity.Activite;
import com.example.eventsmanagement.entity.Evenement;
import com.example.eventsmanagement.entity.Utilisateur;
import com.example.eventsmanagement.repositories.ActiviteRepo;
import com.example.eventsmanagement.repositories.EvenementRepo;
import com.example.eventsmanagement.repositories.UtilisateurRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExamService implements ExamServiceImpl{

    @Autowired
    private EvenementRepo evenementRepo;
    @Autowired
    private UtilisateurRepo utilisateurRepo;
    @Autowired
    private ActiviteRepo activiteRepo;


    @Override
    public Evenement addEvenement(Evenement e) {

        return evenementRepo.save(e);
    }

    @Override
    public Activite addActivite(Activite a) {
        return activiteRepo.save(a);
    }

    @Override
    public void affectActiviteToEvent(Long idA, Long idE) {
        Evenement evenement = evenementRepo.findById(idE).orElseThrow(() -> new EntityNotFoundException("Evenement not found"));
        Activite activite = activiteRepo.findById(idA).orElseThrow(() -> new EntityNotFoundException("Activite not found"));

        if (evenement.getActivites() == null) {
            evenement.setActivites(new ArrayList<>());
        }

        evenement.getActivites().add(activite);
        evenementRepo.save(evenement);
    }


    public Utilisateur saveUtilisateur(Utilisateur utilisateur){
        return utilisateurRepo.save(utilisateur);
    }
}
