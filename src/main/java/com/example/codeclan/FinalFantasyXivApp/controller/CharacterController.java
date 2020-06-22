package com.example.codeclan.FinalFantasyXivApp.controller;

import com.example.codeclan.FinalFantasyXivApp.models.Character;
import com.example.codeclan.FinalFantasyXivApp.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping(value = "/characters")
    public ResponseEntity<List<Character>> getAllCharacters(){
        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/characters/{id}")
    public ResponseEntity getCharacter(@PathVariable Long id){
        return new ResponseEntity<>(characterRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/characters")
    public ResponseEntity<Character> postCharacter(@RequestBody Character character){
        characterRepository.save(character);
        return new ResponseEntity<>(character, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/characters/{id}")
    public ResponseEntity<Character> updateCharacter(@RequestBody Character character){
        characterRepository.save(character);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @DeleteMapping(value = "/characters/{id}")
    public ResponseEntity<Character> deleteCharacter(@PathVariable Long id){
        Character found = characterRepository.getOne(id);
        characterRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
