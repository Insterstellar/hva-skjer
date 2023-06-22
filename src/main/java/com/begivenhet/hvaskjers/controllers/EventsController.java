package com.begivenhet.hvaskjers.controllers;


import com.begivenhet.hvaskjers.models.Events;
import com.begivenhet.hvaskjers.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(("/api/v1/events"))
public class EventsController {
    @Autowired
    private final EventService eventService;

    public EventsController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/save/{group_id}/{cat_id}")
    private ResponseEntity<Events> saveEvents(@RequestBody Events saveEvent, @PathVariable Long group_id, @PathVariable Long cat_id){
        Events events=eventService.saveEvent(saveEvent,group_id,cat_id);
        return new ResponseEntity<>(events, HttpStatus.CREATED);
    }

    @PostMapping("/saver")
    public Events events(@RequestBody Events events1){
        return eventService.saveYourEvent(events1);
    }
    @GetMapping("/all")
    public List<Events> all(){
        return eventService.allEvents();
    }

    @GetMapping("/names/{name}")
    public Events findWithName(@PathVariable("name") String eventName){
        return eventService.findByName(eventName);
    }

    @PostMapping("/updte/{event_id}")
    public Events updatEvents(@RequestBody Events updateEvent, @PathVariable Long event_id){


        return eventService.updateEvent(updateEvent,event_id);
    }


}
   // EVents 3
   // Example Event
