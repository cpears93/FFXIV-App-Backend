package com.example.codeclan.FinalFantasyXivApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servers")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "world")
    private String world;

    @Column(name = "server")
    private String server;

    @Column(name = "dataCenter")
    private String dataCenter;

    @Column(name = "population")
    private int population;

    @Column(name = "serverStatus")
    private String serverStatus;

    @JsonIgnoreProperties(value="server")
    @OneToMany(mappedBy = "server", fetch = FetchType.LAZY)
    private List<com.example.codeclan.FinalFantasyXivApp.models.Character> characters;

    public Server(String name, String world, String dataCenter, int population) {
        this.id = id;
        this.name = name;
        this.world = world;
        this.server = server;
        this.dataCenter = dataCenter;
        this.population = population;
        this.serverStatus = serverStatus;
        this.characters = new ArrayList<com.example.codeclan.FinalFantasyXivApp.models.Character>();
    }

    public Server() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    public List<com.example.codeclan.FinalFantasyXivApp.models.Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<com.example.codeclan.FinalFantasyXivApp.models.Character> characters) {
        this.characters = characters;
    }

    public void addCharacter(com.example.codeclan.FinalFantasyXivApp.models.Character character) {
        this.characters.add(character);
    }
}
