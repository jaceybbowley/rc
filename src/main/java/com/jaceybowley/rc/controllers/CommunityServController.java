package com.jaceybowley.rc.controllers;

import com.jaceybowley.rc.exceptions.ResourceNotFoundException;
import com.jaceybowley.rc.models.Services;
import com.jaceybowley.rc.repositories.ServicesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/communityservices")
public class CommunityServController {

    @Autowired
    public ServicesRepo sRepo;

    @GetMapping("/allservices")
    public List<Services> getAllServices() {
        return sRepo.findAll();
    }

    @PutMapping("/updatecommunityservices/{id}")
    public ResponseEntity<Services> updatedUsers(@PathVariable int id, @RequestBody Services serv) {
        Services comAcctId = sRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
        //update community services - recovery services offered
        comAcctId.setHallucinogenServices(serv.isHallucinogenServices());
        comAcctId.setAlcoholServices(serv.isAlcoholServices());
        comAcctId.setCannabisServices(serv.isCannabisServices());
        comAcctId.setDetoxServices(serv.isDetoxServices());
        comAcctId.setGamblingServices(serv.isGamblingServices());
        comAcctId.setEatingDisorderServices(serv.isEatingDisorderServices());
        comAcctId.setInhalantServices(serv.isInhalantServices());
        comAcctId.setTobaccoServices(serv.isTobaccoServices());
        comAcctId.setSexServices(serv.isSexServices());
        //update community account - insurance options accepted
        comAcctId.setInsuranceOne(serv.isInsuranceOne());
        comAcctId.setInsuranceTwo(serv.isInsuranceTwo());
        comAcctId.setInsuranceThree(serv.isInsuranceThree());
        comAcctId.setInsuranceFour(serv.isInsuranceFour());
        comAcctId.setInsuranceFive(serv.isInsuranceFive());
        comAcctId.setInsuranceSix(serv.isInsuranceSix());
        comAcctId.setInsuranceSeven(serv.isInsuranceSeven());
        comAcctId.setInsuranceEight(serv.isInsuranceEight());
        comAcctId.setInsuranceNine(serv.isInsuranceNine());
        comAcctId.setInsuranceTen(serv.isInsuranceTen());
        Services updatedComServ = sRepo.save(comAcctId);
        return ResponseEntity.ok(updatedComServ);
    }


}
