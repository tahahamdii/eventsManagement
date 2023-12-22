package com.example.eventsmanagement.repositories;

import com.example.eventsmanagement.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiviteRepo extends JpaRepository<Activite,Long> {
}
