package com.begivenhet.hvaskjers.interfaces;

import com.begivenhet.hvaskjers.dtos.DtoGroup;
import com.begivenhet.hvaskjers.models.Groups;
import com.begivenhet.hvaskjers.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface GroupInterface {
    Groups saveGroups(Groups groups, Long id);
    List<Groups> allGroups();
}
