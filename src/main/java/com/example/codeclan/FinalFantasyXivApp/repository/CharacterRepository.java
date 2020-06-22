package com.example.codeclan.FinalFantasyXivApp.repository;

import com.example.codeclan.FinalFantasyXivApp.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    List<Character> findByBaseClass(String baseClass);
    List<Character> findByJob(String job);
    List<Character> findByRole(String role);
    List<Character> findByStartingLocation(String startingLocation);
    List<Character> findByPrerequisites(String prerequisites);
    List<Character> findByStartingLevel(int level);
}
