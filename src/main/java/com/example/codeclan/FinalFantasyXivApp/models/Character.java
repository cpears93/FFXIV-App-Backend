package com.example.codeclan.FinalFantasyXivApp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "characters")
public class Character {

    @Column(name = "baseClass")
    private String baseClass;

    @Column(name = "Job")
    private String job;

    @Column(name = "Role")
    private String role;

    @Column(name = "startingLocation")
    private String startingLocation;

    @Column(name = "Prerequisites")
    private String prerequisites;

    @Column(name = "startingLevel")
    private int startingLevel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="characters")
    @ManyToOne
    @JoinColumn(name="server_id", nullable = false)
    private Server server;


    public Character(String baseClass, String job, String role, String startingLocation, String prerequisites, int startingLevel, Server server) {
        this.baseClass = baseClass;
        this.job = job;
        this.role = role;
        this.startingLocation = startingLocation;
        this.prerequisites = prerequisites;
        this.startingLevel = startingLevel;
        this.server = server;
    }

    public Character() {
    }

    public String getBaseClass() {
        return baseClass;
    }

    public void setBaseClass(String baseClass) {
        this.baseClass = baseClass;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getStartingLevel() {
        return startingLevel;
    }

    public void setStartingLevel(int startingLevel) {
        this.startingLevel = startingLevel;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}
