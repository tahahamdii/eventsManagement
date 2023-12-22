package com.example.eventsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private   Long idU;
    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "numtel")
    private Long numTelephone;
    @Column(name = "role")
    private Role role ;
    @OneToMany(mappedBy = "responable")
    List<Evenement> evenementsEnCharge;
    @ManyToMany(mappedBy = "participant")
    List<Evenement> evenementsParticipants;
}
