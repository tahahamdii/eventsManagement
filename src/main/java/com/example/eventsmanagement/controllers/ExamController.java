package com.example.eventsmanagement.controllers;

import com.example.eventsmanagement.entity.Evenement;
import com.example.eventsmanagement.entity.Utilisateur;
<<<<<<< HEAD
import com.example.eventsmanagement.services.ExamService;
import com.example.eventsmanagement.services.ExamServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
=======
import com.example.eventsmanagement.services.ExamServiceImpl;
import lombok.AllArgsConstructor;
>>>>>>> origin/master
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/events")
public class ExamController {
<<<<<<< HEAD
    private ExamServiceImpl examServiceImpl;
    @Autowired
    private ExamService examService;
=======
    private ExamServiceImpl examService;
>>>>>>> origin/master

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

}
