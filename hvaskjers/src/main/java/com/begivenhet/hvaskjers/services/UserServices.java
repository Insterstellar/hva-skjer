package com.begivenhet.hvaskjers.services;

import com.begivenhet.hvaskjers.interfaces.UserInterfaces;
import com.begivenhet.hvaskjers.models.UserModel;
import com.begivenhet.hvaskjers.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices implements UserInterfaces {
    @Autowired
    private final UserRepo userRepo;

    public UserServices(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserModel userSave(UserModel saveUser) {
        return userRepo.save(saveUser);
    }

    @Override
    public List<UserModel> allUser() {
        return userRepo.findAll();
    }


}
