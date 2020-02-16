package com.ecodencode.confSchedule.repositories;

import com.ecodencode.confSchedule.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
