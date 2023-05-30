package com.begivenhet.hvaskjers.services;

import com.begivenhet.hvaskjers.dtos.DtoGroup;
import com.begivenhet.hvaskjers.interfaces.GroupInterface;
import com.begivenhet.hvaskjers.models.Groups;
import com.begivenhet.hvaskjers.models.UserModel;
import com.begivenhet.hvaskjers.repositories.GroupRepo;
import com.begivenhet.hvaskjers.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServices implements GroupInterface {

    @Autowired
    private final UserRepo userRepo;
    @Autowired
    private final GroupRepo groupRepo;

    public GroupServices(UserRepo userRepo, GroupRepo groupRepo) {
        this.userRepo = userRepo;
        this.groupRepo = groupRepo;
    }

    @Override
    public Groups saveGroups(Groups groups,Long id) {
        UserModel model=userRepo.findById(id).orElseThrow();
        /*String description= groups.getDescription();
        if(description.length()>300){
            description=description.substring(0,300);
        }
        groups.setDescription(description);*/


        Groups previousGroups = model.getGroups();
        if (previousGroups != null) {
            previousGroups.setUserModel(null);
            model.setGroups(null);
            groupRepo.delete(previousGroups);
        }

        model.setGroups(groups);
        groups.setUserModel(model);

       return groupRepo.save(groups);



    }

    @Override
    public List<Groups> allGroups() {
        return groupRepo.findAll();
    }
}
