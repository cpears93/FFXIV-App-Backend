package com.example.codeclan.FinalFantasyXivApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "raids")
public class Raid {

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "itemLevelReq")
    private int itemLevelReq;

    @Column(name = "turns")
    private int turns;

    @Column(name = "lootItemLevel")
    private int lootItemLevel;

    @Column(name = "tomePerTurn")
    private int tomePerTurn;

    @Column(name = "unlock")
    private String unlock;

    @JsonIgnoreProperties(value= "raid")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "character_raid",
            joinColumns = {@JoinColumn(name = "raid_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="character_id", nullable = false, updatable = false)}
    )
    private List<Character> characters;

    public Raid(String name, int level, int itemLevelReq, int turns, int lootItemLevel, int tomePerTurn, String unlock) {
        this.name = name;
        this.level = level;
        this.itemLevelReq = itemLevelReq;
        this.turns = turns;
        this.lootItemLevel = lootItemLevel;
        this.tomePerTurn = tomePerTurn;
        this.unlock = unlock;
    }

    public Raid() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getItemLevelReq() {
        return itemLevelReq;
    }

    public void setItemLevelReq(int itemLevelReq) {
        this.itemLevelReq = itemLevelReq;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getLootItemLevel() {
        return lootItemLevel;
    }

    public void setLootItemLevel(int lootItemLevel) {
        this.lootItemLevel = lootItemLevel;
    }

    public int getTomePerTurn() {
        return tomePerTurn;
    }

    public void setTomePerTurn(int tomePerTurn) {
        this.tomePerTurn = tomePerTurn;
    }

    public String getUnlock() {
        return unlock;
    }

    public void setUnlock(String unlock) {
        this.unlock = unlock;
    }
}
