package com.begivenhet.hvaskjers.repositories;

import com.begivenhet.hvaskjers.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepo extends JpaRepository<Events, Long> {
   Events findFirstByEventNameContainingIgnoreCase(String events);
   // ContainingIgnoreCase
}
