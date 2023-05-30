package com.begivenhet.hvaskjers.repositories;

import com.begivenhet.hvaskjers.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
  //  UserModel findByUserName(UserModel userName);
}
