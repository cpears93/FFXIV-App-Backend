package com.example.codeclan.FinalFantasyXivApp.controller;

import com.example.codeclan.FinalFantasyXivApp.models.Raid;
import com.example.codeclan.FinalFantasyXivApp.repository.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/raids")
    public ResponseEntity <List<Raid>> getAllRaids(){
        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/servers/{id}")
    public ResponseEntity getServer(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/raids")
    public ResponseEntity<Raid> createRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity<>(raid, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/servers/{id}")
    public ResponseEntity<Raid> updateRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity<>(raid, HttpStatus.OK);
    }

    @DeleteMapping(value = "/servers/{id}")
    public ResponseEntity<Raid> deleteRaid(@PathVariable Long id){
        Raid found = raidRepository.getOne(id);
        raidRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
