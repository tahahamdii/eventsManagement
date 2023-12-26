package com.example.eventsmanagement.entity;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;
import jdk.jfr.Frequency;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "activite")
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idA")
    private Long idA;
    @Column(name = "libelle")
    private String libelle ;
    @Column(name = "description")
    private String description;
    @ManyToOne
    private Evenement evenement;
}
