package com.begivenhet.hvaskjers.interfaces;

import com.begivenhet.hvaskjers.models.UserModel;

import java.util.Iterator;
import java.util.List;

public interface UserInterfaces {
    UserModel userSave(UserModel saveUser);
    List<UserModel> allUser();
   // UserModel userName(UserModel userName);
}
