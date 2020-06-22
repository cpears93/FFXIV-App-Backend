package com.example.codeclan.FinalFantasyXivApp.controller;

import com.example.codeclan.FinalFantasyXivApp.models.Server;
import com.example.codeclan.FinalFantasyXivApp.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {

    @Autowired
    ServerRepository serverRepository;

    @GetMapping(value = "/servers")
    public ResponseEntity<List<Server>> getAllServers(){
        return new ResponseEntity<>(serverRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/servers/{id}")
    public ResponseEntity getServer(@PathVariable Long id){
        return new ResponseEntity<>(serverRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/servers")
    public ResponseEntity<Server> createServer(@RequestBody Server server){
        serverRepository.save(server);
        return new ResponseEntity<>(server, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/servers/{id}")
    public ResponseEntity<Server> updateServer(@RequestBody Server server){
        serverRepository.save(server);
        return new ResponseEntity<>(server, HttpStatus.OK);
    }

    @DeleteMapping(value = "/servers/{id}")
    public ResponseEntity<Server> deleteServer(@PathVariable Long id) {
        Server found = serverRepository.getOne(id);
        serverRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
