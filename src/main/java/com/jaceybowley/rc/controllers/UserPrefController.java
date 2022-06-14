package com.jaceybowley.rc.controllers;

import com.jaceybowley.rc.exceptions.ResourceNotFoundException;
import com.jaceybowley.rc.models.Preferences;
import com.jaceybowley.rc.repositories.PreferencesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/userpreferences")
public class UserPrefController {

    @Autowired
    public PreferencesRepo pRepo;

    @GetMapping("/alluserpreferences")
    public List<Preferences> getAllAccounts() {
        return pRepo.findAll();
    }

    @DeleteMapping("/deleteuserpreferences/{id}")
    public String deleteUsers(@PathVariable int id) {
        pRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User by this ID was not found"));
        pRepo.deleteById(id);
        return "This user with id" + id + "is deleted from our database";
    }

    @PutMapping("/updateuserprferences/{id}")
    public ResponseEntity<Preferences> updatedUsers(@PathVariable int id, @RequestBody Preferences pref) {
        Preferences userAcctId = pRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
       //update user preferences - recovery services
        userAcctId.setHallucinogenRecovery(pref.isHallucinogenRecovery());
        userAcctId.setAlcoholRecovery(pref.isAlcoholRecovery());
        userAcctId.setCannabisRecovery(pref.isCannabisRecovery());
        userAcctId.setDetoxRecovery(pref.isDetoxRecovery());
        userAcctId.setGamblingRecovery(pref.isGamblingRecovery());
        userAcctId.setEatingDisorderRecovery(pref.isEatingDisorderRecovery());
        userAcctId.setInhalantRecovery(pref.isInhalantRecovery());
        userAcctId.setTobaccoRecovery(pref.isTobaccoRecovery());
        userAcctId.setSexRecovery(pref.isSexRecovery());
        //update user preferences - insurance options
        userAcctId.setInsuranceOne(pref.isInsuranceOne());
        userAcctId.setInsuranceTwo(pref.isInsuranceTwo());
        userAcctId.setInsuranceThree(pref.isInsuranceThree());
        userAcctId.setInsuranceFour(pref.isInsuranceFour());
        userAcctId.setInsuranceFive(pref.isInsuranceFive());
        userAcctId.setInsuranceSix(pref.isInsuranceSix());
        userAcctId.setInsuranceSeven(pref.isInsuranceSeven());
        userAcctId.setInsuranceEight(pref.isInsuranceEight());
        userAcctId.setInsuranceNine(pref.isInsuranceNine());
        userAcctId.setInsuranceTen(pref.isInsuranceTen());
        Preferences updatedUsersPref = pRepo.save(userAcctId);
        return ResponseEntity.ok(updatedUsersPref);
    }
}

