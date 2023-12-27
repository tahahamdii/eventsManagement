package com.example.eventsmanagement.repositories;

import com.example.eventsmanagement.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementRepo extends JpaRepository<Evenement,Long> {
    List<Evenement> findByResponsableId(Long responsableId);
}
