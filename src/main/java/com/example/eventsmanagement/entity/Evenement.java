package com.example.eventsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ide")
    private Long idE;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "desc")
    private String description;
    @Column(name = "dateEvene")
    private LocalDate dateEvent;
    @Column(name = "nbParticipants")
    private Long nbParticipants ;
    @ManyToOne
    Utilisateur responsable ;
    @ManyToMany
    private List<Utilisateur> particiapants;
    @OneToMany(mappedBy = "evenement")
    private List<Activite> activites;

}
