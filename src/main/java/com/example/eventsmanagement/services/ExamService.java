package com.example.eventsmanagement.services;

import com.example.eventsmanagement.entity.Activite;
import com.example.eventsmanagement.entity.Evenement;
import com.example.eventsmanagement.entity.Utilisateur;
import com.example.eventsmanagement.repositories.ActiviteRepo;
import com.example.eventsmanagement.repositories.EvenementRepo;
import com.example.eventsmanagement.repositories.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
