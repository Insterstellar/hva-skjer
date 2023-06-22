package com.begivenhet.hvaskjers.services;

import com.begivenhet.hvaskjers.interfaces.EventInterfaces;
import com.begivenhet.hvaskjers.models.Categorys;
import com.begivenhet.hvaskjers.models.Events;
import com.begivenhet.hvaskjers.models.Groups;
import com.begivenhet.hvaskjers.repositories.CategoryRepo;
import com.begivenhet.hvaskjers.repositories.EventsRepo;
import com.begivenhet.hvaskjers.repositories.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EventService implements EventInterfaces {

    @Autowired
    private final EventsRepo eventsRepo;
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private GroupRepo groupRepo;

    public EventService(EventsRepo eventsRepo) {
        this.eventsRepo = eventsRepo;
    }



    @Override
    public Events saveEvent(Events saveEvent,Long group_id, Long cat_id) {
        //groups save
        Groups groups = groupRepo.findById(group_id).orElseThrow();
            saveEvent.setGroups(groups);

            groupRepo.save(groups);
        groups.getEvents().add(saveEvent);

//category save
        Categorys categorys=categoryRepo.findById(cat_id).orElseThrow();
        saveEvent.setCategory(categorys);

        categoryRepo.save(categorys);
        categorys.getEventsList().add(saveEvent);


       return eventsRepo.save(saveEvent);
    }

    @Override
    public List<Events> allEvents() {
        return eventsRepo.findAll();
    }

    @Override
    public Events saveYourEvent(Events events) {
        return eventsRepo.save(events);
    }

    @Override
    public Events findByName(String eventName) {
        return eventsRepo.findFirstByEventNameContainingIgnoreCase(eventName);
    }

    @Override
    public Events updateEvent(Events events, Long id) {
        Events oldEvent = eventsRepo.findById(id).orElseThrow(null);
        oldEvent.setEventName(events.getEventName());
        oldEvent.setEventDescription(events.getEventDescription());
        oldEvent.setEventImage(events.getEventImage());
        oldEvent.setEventVenue(events.getEventVenue());
        //oldEvent.setEventEndTime(e);
        eventsRepo.save(oldEvent);


        return oldEvent;
    }


}
