package com.example.codeclan.FinalFantasyXivApp.repository;

import com.example.codeclan.FinalFantasyXivApp.models.Raid;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaidRepository extends JpaAttributeConverter<Raid, Long> {

    List<Raid> findByName(String name);
    List<Raid> findByLevel(int level);
    List<Raid> findByItemLevelReq(int itemLevelReq);
    List<Raid> findByTurns(int turns);
    List<Raid> findByLootItemLevel(int lootItemLevel);
    List<Raid> findByTomePerTurn(int tomePerTurn);
    List<Raid> findByUnlock(String unlock);
}
