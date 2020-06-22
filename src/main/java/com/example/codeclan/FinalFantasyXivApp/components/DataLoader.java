package com.example.codeclan.FinalFantasyXivApp.components;

import com.example.codeclan.FinalFantasyXivApp.models.Character;
import com.example.codeclan.FinalFantasyXivApp.models.Server;
import com.example.codeclan.FinalFantasyXivApp.repository.CharacterRepository;
import com.example.codeclan.FinalFantasyXivApp.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    ServerRepository serverRepository;

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

    }
}
