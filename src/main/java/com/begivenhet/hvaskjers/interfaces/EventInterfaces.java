package com.begivenhet.hvaskjers.interfaces;

import com.begivenhet.hvaskjers.models.Events;

import java.util.List;

public interface EventInterfaces {
    Events saveEvent(Events saveEvent,Long group_id, Long cat_id);
    List<Events> allEvents();

    Events saveYourEvent(Events events);
    Events findByName(String eventName);
    Events updateEvent(Events events,Long id);
}
