package com.begivenhet.hvaskjers.controllers;


import com.begivenhet.hvaskjers.dtos.DtoGroup;
import com.begivenhet.hvaskjers.models.Groups;
import com.begivenhet.hvaskjers.models.UserModel;
import com.begivenhet.hvaskjers.services.GroupServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/group")
public class GroupController {
    /*
    TO BE CONTINUED
    * */
    @Autowired
    private final GroupServices groupServices;

    public GroupController(GroupServices groupServices) {
        this.groupServices = groupServices;
    }

    @PostMapping("/save/{id}")
    public ResponseEntity<Groups> saveGreoups(@RequestBody Groups groups, @PathVariable Long id){
        groupServices.saveGroups(groups, id);
        return ResponseEntity.ok().build();

    }

    @GetMapping("/all")
    public List<Groups> allGroups(){
        return groupServices.allGroups();
    }
}
