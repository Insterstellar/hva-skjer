package com.begivenhet.hvaskjers.repositories;

import com.begivenhet.hvaskjers.models.Categorys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Categorys, Long> {
}
