package com.example.eventsmanagement.services;

import com.example.eventsmanagement.entity.Activite;
import com.example.eventsmanagement.entity.Evenement;
import com.example.eventsmanagement.entity.Utilisateur;

import java.util.List;

public interface ExamServiceImpl {
 public Evenement addEvenement(Evenement e);
 public Activite addActivite(Activite a);
 public void affectActiviteToEvent(Long activiteId,Long eventId);
 public String addUser(Utilisateur u , Long idE);
 public List<Evenement> getEventsByResponsable(Long responsableId);
}
