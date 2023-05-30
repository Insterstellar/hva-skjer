package com.begivenhet.hvaskjers.controllers;


import com.begivenhet.hvaskjers.models.UserModel;
import com.begivenhet.hvaskjers.services.UserServices;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }


    @PostMapping ("/save")
    public ResponseEntity<UserModel> saveUsers(@RequestBody UserModel saveUser){
        UserModel users=userServices.userSave(saveUser);
        return new ResponseEntity<>(users, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<UserModel> allUsers(){
        return userServices.allUser();
    }
    @PostMapping("/attend")
    public ResponseEntity<UserModel> attend(@RequestBody UserModel attendGroup){

        return new  ResponseEntity<>(HttpStatus.CREATED);
    }
}
