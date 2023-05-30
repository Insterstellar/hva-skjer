package com.begivenhet.hvaskjers.repositories;

import com.begivenhet.hvaskjers.models.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepo extends JpaRepository<Groups, Long> {
}
