package com.ecodencode.confSchedule.controllers;

import com.ecodencode.confSchedule.models.Session;
import com.ecodencode.confSchedule.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

  // wire repo to controller
  @Autowired
  private SessionRepository sessionRepository;

  // return all sessions
  @GetMapping
  public List<Session> list() {
    return sessionRepository.findAll();
  }

  // get a specific session by id
  @GetMapping
  @RequestMapping("{id}")
  public Session get(@PathVariable Long id) {
    return sessionRepository.getOne(id);
  }

  // create a session
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Session create(@RequestBody final Session session) {
    return sessionRepository.saveAndFlush(session);
  }

  // delete a session
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable Long id) {
    // Also need to check for children records before deleting
    sessionRepository.deleteById(id);
  }

  // update/edit a session
  @RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public Session update(@PathVariable Long id, @RequestBody Session session) {
    // because this is a PUT, we expect all attributes to be passed in.
    // A PATCH would only need what you want to update
    // TODO: Add validation that all attributes are passed-in, otherwise return a 400 bad payload
    Session existingSession = sessionRepository.getOne(id);
    BeanUtils.copyProperties(session, existingSession, "session_id");
    return sessionRepository.saveAndFlush(existingSession);
  }

}
