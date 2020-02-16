package com.ecodencode.confSchedule.controllers;

import com.ecodencode.confSchedule.repositories.SessionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsContoller {
  private SessionRepository sessionRepository;
}
