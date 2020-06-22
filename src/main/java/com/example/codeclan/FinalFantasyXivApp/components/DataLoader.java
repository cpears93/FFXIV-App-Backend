package com.example.codeclan.FinalFantasyXivApp.components;

import com.example.codeclan.FinalFantasyXivApp.models.Character;
import com.example.codeclan.FinalFantasyXivApp.models.Raid;
import com.example.codeclan.FinalFantasyXivApp.models.Server;
import com.example.codeclan.FinalFantasyXivApp.repository.CharacterRepository;
import com.example.codeclan.FinalFantasyXivApp.repository.RaidRepository;
import com.example.codeclan.FinalFantasyXivApp.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    ServerRepository serverRepository;

    @Autowired
    RaidRepository raidRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Server balmung = new Server("Balmung", "Crystal", "North America", 87563);
        serverRepository.save(balmung);

        Server diabolos = new Server("Diabolos", "Crystal", "North America", 52461);
        serverRepository.save(diabolos);

        Server jenova = new Server("Jenova", "Aether", "North America", 94863);
        serverRepository.save(jenova);

        Server sargatanas = new Server("Sargatanas", "Aether", "North America", 67295);
        serverRepository.save(sargatanas);

        Server behemoth = new Server("Behemoth", "Primal", "North America", 45828);
        serverRepository.save(behemoth);

        Server leviathan = new Server("Leviathan", "Primal", "North America", 84367);
        serverRepository.save(leviathan);

        Server moogle = new Server("Moogle", "Chaos", "Europe", 28823);
        serverRepository.save(moogle);

        Server ragnarok = new Server("Ragnarok", "Chaos", "Europe", 65033);
        serverRepository.save(ragnarok);

        Server odin = new Server("Odin", "Light", "Europe", 71452);
        serverRepository.save(odin);

        Server shiva = new Server("Shiva", "Light", "Europe", 83602);
        serverRepository.save(shiva);

        Server garuda = new Server("Garuda", "Elemental", "Japan", 93725);
        serverRepository.save(garuda);

        Server ramuh = new Server("Ramuh", "Elemental", "Japan", 68392);
        serverRepository.save(ramuh);

        Server bahamut = new Server("Bahamut", "Gaia", "Japan", 95826);
        serverRepository.save(bahamut);

        Server alexander = new Server("Alexander", "Gaia", "Japan", 38729);
        serverRepository.save(alexander);

        Server titan = new Server("Titan", "Mana", "Japan", 60372);
        serverRepository.save(titan);

        Server mandragora = new Server("Mandragora", "Mana", "Japan", 46329);
        serverRepository.save(mandragora);




        Character dragoon = new Character("Lancer", "Dragoon", "Melee DPS", "Gridania", "None", 1 , shiva);
        characterRepository.save(dragoon);

        Character warrior = new Character("Marauder", "Warrior", "Tank", "Ul'dah", "None", 1, titan);
        characterRepository.save(warrior);

        Character astrologian = new Character("None", "Astrologian", "Healer", "Ishgard", "Level 50", 30, alexander);
        characterRepository.save(astrologian);

        Character machinist = new Character("None", "Machinist", "Ranged Physical DPS", "Ishgard", "Level 50", 30, bahamut);
        characterRepository.save(machinist);

        Character redMage = new Character("None", "Red Mage", "Ranged Magical DPS", "Ul'dah", "Level 50", 50, ramuh);
        characterRepository.save(redMage);

        Character dancer = new Character("None", "Dancer", "Ranged Physical DPS", "Limsa Lominsa", "Level 60", 60, odin);
        characterRepository.save(dancer);

        Character monk = new Character("Pugilist", "Monk", "Melee DPS", "Gridania", "None", 1, odin);
        characterRepository.save(monk);

        Character scholar = new Character("Arcanist", "Scholar", "Healer", "Limsa Lominsa", "None", 1, jenova);
        characterRepository.save(scholar);

        Character gunBreaker = new Character("None", "Gunbreaker", "Tank", "Gridania", "Level 60", 60, moogle);
        characterRepository.save(gunBreaker);

        Character whiteMage = new Character("Conjurer", "White Mage", "Healer", "Gridania", "None", 1, balmung);
        characterRepository.save(whiteMage);

        Character summoner = new Character("Arcanist", "Summoner", "Ranged Magical DPS", "Limsa Lominsa", "None", 1, jenova);
        characterRepository.save(summoner);

        Character ninja = new Character("Rougue", "Ninja", "Melee DPS", "Ul'dah", "None", 1, garuda);
        characterRepository.save(ninja);

        Character samurai = new Character("None", "Samurai", "Melee DPS", "Ul'dah", "Level 50", 50, ragnarok);
        characterRepository.save(samurai);

        Character blackMage = new Character("Thaumaturge", "Black Mage", "Ranged Magical DPS", "Ul'dah", "None", 1, bahamut);
        characterRepository.save(blackMage);

        Character darkKnight = new Character("None", "Dark Knight", "Tank", "Ishgard", "Level 50", 50, titan);
        characterRepository.save(darkKnight);

        Character paladin = new Character("Gladiator", "Paladin", "Tank", "Ul'dah", "None", 1, behemoth);
        characterRepository.save(paladin);

        Character blueMage = new Character("None", "Blue Mage", "Limited Job/Ranged Magical DPS", "Limsa Lominsa", "Level 50", 1, moogle);
        characterRepository.save(blueMage);

        Character bard = new Character("Archer", "Bard", "Ranged Physical DPS", "Gridania", "None", 1, titan);
        characterRepository.save(bard);


        Raid aRealmReborn1 = new Raid("The Binding Coil of Bahamut", 50, 70, 5, 95, 10, "Primal Awakening");
        raidRepository.save(aRealmReborn1);

        Raid aRealmReborn2 = new Raid("The Second Coil of Bahamut", 50, 90, 4, 110, 20, "Another Turn in the Coil");
        raidRepository.save(aRealmReborn2);

        Raid aRealmReborn3 = new Raid("The Final Coil of Bahamut", 50, 90, 4, 130, 30, "Fragments of Truth");
        raidRepository.save(aRealmReborn3);

        Raid heavensward1 = new Raid("Alexander: Gordias", 60, 170, 4, 190, 10, "Disarmed");
        raidRepository.save(heavensward1);

        Raid heavensward2 = new Raid("Alexander: Midas", 60, 215, 4, 220, 10, "Disarmed");
        raidRepository.save(heavensward2);

        Raid heavensward3 = new Raid("Alexander: The Creator", 60, 230, 4, 250, 20, "Rearmed");
        raidRepository.save(heavensward3);

        Raid stormblood1 = new Raid("Omega: Deltascape", 70, 295, 4, 320, 10, "Into the Deltascape");
        raidRepository.save(stormblood1);

        Raid stormblood2 = new Raid("The Unending Coil of Bahamut", 70, 340, 1, 345, 30, "Wandering Minstrel, Kugane");
        raidRepository.save(stormblood2);

        Raid stormblood3 = new Raid("Omega: Sigmascape", 70, 325, 4, 350, 10, "No Slowing Down");
        raidRepository.save(stormblood3);

        Raid stormblood4 = new Raid("The Minstrel's Ballad: The Weapon's Refrain", 70, 370, 1, 375, 30, "Wandering Minstrel, Kugane");
        raidRepository.save(stormblood4);

        Raid stormblood5 = new Raid("Omega: Alphascape", 70, 355, 4, 380, 20, "In the Beginning, There Was Chaos");
        raidRepository.save(stormblood5);

        Raid shadowbringers1 = new Raid("Eden's Gate", 80, 425, 4, 450, 15, "Deploy The Core");
        raidRepository.save(shadowbringers1);

        Raid shadowbringers2 = new Raid("The Epic of Alexander", 80, 475, 1, 475, 30, "Wandering Minstrel, Kugane");
        raidRepository.save(shadowbringers2);

        Raid shadowbringers3 = new Raid("Eden's Verse", 80, 455, 4, 480, 30, "Blood and Thunder");
        raidRepository.save(shadowbringers3);
    }
}
