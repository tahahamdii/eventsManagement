package com.example.eventsmanagement.controllers;

import com.example.eventsmanagement.entity.Activite;
import com.example.eventsmanagement.entity.Evenement;
import com.example.eventsmanagement.entity.Utilisateur;

import com.example.eventsmanagement.services.ExamService;
import com.example.eventsmanagement.services.ExamServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/events")
public class ExamController {
    private ExamServiceImpl examServiceImpl;
    @Autowired
    private ExamService examService;

    @PostMapping("/addEvent")
    Evenement addEvenement(@RequestBody Evenement e){
        // Make sure responsable is a managed entity (saved in the database)
        Utilisateur responsable = e.getResponsable();
        if (responsable != null && responsable.getIdU() == null) {
            // If the responsable doesn't have an ID, save it first
            examService.saveUtilisateur(responsable);
        }

        // Now save the Evenement
        return examService.addEvenement(e);
    }
    @PostMapping("/addActivite")
    Activite addActivite(@RequestBody Activite a){
        return examService.addActivite(a);

    }
    @PostMapping("/affectActivitesToEvent/{idA}")
    public ResponseEntity<String> affectActivitesToEvent(@RequestParam Long idA, @RequestParam Long idE){
        examService.affectActiviteToEvent(idA,idE);
        return ResponseEntity.ok("activites affectes");
    }


}
