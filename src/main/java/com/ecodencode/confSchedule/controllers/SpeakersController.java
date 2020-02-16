package com.ecodencode.confSchedule.controllers;

import com.ecodencode.confSchedule.models.Speaker;
import com.ecodencode.confSchedule.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

  // wire repo to controller
  @Autowired
  private SpeakerRepository speakerRepository;

  // return all speakers
  @GetMapping
  public List<Speaker> list() {
    return speakerRepository.findAll();
  }

  // get a specific speaker by id
  @GetMapping
  @RequestMapping("{id}")
  public Speaker get(@PathVariable Long id) {
    return speakerRepository.getOne(id);
  }

  // create a speaker
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Speaker create(@RequestBody final Speaker speaker) {
    return speakerRepository.saveAndFlush(speaker);
  }

  // delete a speaker
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable Long id) {
    // Also need to check for children records before deleting
    speakerRepository.deleteById(id);
  }

  // update/edit a speaker
  @RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
    // TODO: Add validation that all attributes are passed-in, otherwise return a 400 bad payload
    Speaker existingSpeaker = speakerRepository.getOne(id);
    BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");
    return speakerRepository.saveAndFlush(existingSpeaker);
  }
}
