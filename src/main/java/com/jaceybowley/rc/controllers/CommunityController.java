package com.jaceybowley.rc.controllers;


import com.jaceybowley.rc.exceptions.ResourceNotFoundException;
import com.jaceybowley.rc.models.Community;
import com.jaceybowley.rc.repositories.CommunityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/communityaccount")
public class CommunityController {

    @Autowired
    public CommunityRepo cRepo;

    @GetMapping("/allcommunityaccounts")
    public List<Community> getAllAccounts() {
        return cRepo.findAll();
    }

    @DeleteMapping("/deletecommunityaccount/{id}")
    public String deleteUsers(@PathVariable int id) {
        cRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User by this ID was not found"));
        cRepo.deleteById(id);
        return "This user with id" + id + "is deleted from our database";
    }

    @PutMapping("/updatecommunityaccounts/{id}")
    public ResponseEntity<Community> updatedUsers(@PathVariable int id, @RequestBody Community com) {
        Community comId = cRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        comId.setComCity(com.getComCity());
        comId.setComState(com.getComState());
        comId.setComStreetAddress(com.getComStreetAddress());
        comId.setComZipCode(com.getComZipCode());
        comId.setComName(com.getComName());
        comId.setComEmail(com.getComEmail());
        comId.setComPhoneNumber(com.getComPhoneNumber());
        comId.setComLogin(com.getComLogin());
        comId.setComPassword(com.getComPassword());
        Community updatedComUsers = cRepo.save(comId);
        return ResponseEntity.ok(updatedComUsers);
    }


}
