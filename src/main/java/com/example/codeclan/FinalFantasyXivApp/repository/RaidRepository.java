package com.example.codeclan.FinalFantasyXivApp.repository;

import com.example.codeclan.FinalFantasyXivApp.models.Raid;
import com.example.codeclan.FinalFantasyXivApp.models.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaidRepository extends JpaRepository<Raid, Long> {

    List<Raid> findByName(String name);
    List<Raid> findByLevel(int level);
    List<Raid> findByItemLevelReq(int itemLevelReq);
    List<Raid> findByTurns(int turns);
    List<Raid> findByLootItemLevel(int lootItemLevel);
    List<Raid> findByTomePerTurn(int tomePerTurn);
    List<Raid> findByUnlock(String unlock);
}
