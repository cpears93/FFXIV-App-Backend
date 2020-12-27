package com.example.codeclan.FinalFantasyXivApp.repository;

import com.example.codeclan.FinalFantasyXivApp.models.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServerRepository extends JpaRepository<Server, Long> {

    List<Server> findByName(String name);
    List<Server> findByWorld(String world);
    List<Server> findByDataCenter(String dataCenter);
    List<Server> findByPopulationGreaterThan(int population);
}
