package com.jaceybowley.rc.controllers;

import com.jaceybowley.rc.exceptions.ResourceNotFoundException;
import com.jaceybowley.rc.models.User;
import com.jaceybowley.rc.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/useraccount")
public class UserController {

    @Autowired
    private UserRepo uRepo;

    @GetMapping("/allusers")
    public List<User> getAllUsers() {
        return uRepo.findAll();
    }

    @PutMapping("/updateusers/{id}")
    public ResponseEntity<User> updatedUsers(@PathVariable int id, @RequestBody User user) {
        User userId = uRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        userId.setUserFirstName(user.getUserFirstName());
        userId.setUserLastName(user.getUserLastName());
        userId.setUserEmail(user.getUserEmail());
        userId.setUserPhoneNumber(user.getUserPhoneNumber());
        userId.setUserStreetAddress(user.getUserStreetAddress());
        userId.setUserCity(user.getUserCity());
        userId.setUserState(user.getUserState());
        userId.setUserZipCode(user.getUserZipCode());
        userId.setUserLogin(user.getUserLogin());
        userId.setUserPassword(user.getUserPassword());
        User updatedUsers = uRepo.save(userId);
        return ResponseEntity.ok(updatedUsers);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUsers(@PathVariable int id) {
        uRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User by this ID was not found"));
        uRepo.deleteById(id);
        return "This user with id" + id + "is deleted from our database";

    }
}
