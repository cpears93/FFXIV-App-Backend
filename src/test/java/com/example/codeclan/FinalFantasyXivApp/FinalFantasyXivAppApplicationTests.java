package com.example.codeclan.FinalFantasyXivApp;

import com.example.codeclan.FinalFantasyXivApp.models.Character;
import com.example.codeclan.FinalFantasyXivApp.models.Raid;
import com.example.codeclan.FinalFantasyXivApp.models.Server;
import com.example.codeclan.FinalFantasyXivApp.repository.CharacterRepository;
import com.example.codeclan.FinalFantasyXivApp.repository.RaidRepository;
import com.example.codeclan.FinalFantasyXivApp.repository.ServerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class FinalFantasyXivAppApplicationTests {

	@Autowired
	CharacterRepository characterRepository;

	@Autowired
	ServerRepository serverRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createCharacterAndServerThenSave() {


		Server jenova = new Server("Jenova", "Aether", "North America", 94863);
		serverRepository.save(jenova);
		Character dragoon = new Character("Lancer", "Dragoon", "Melee DPS", "Gridania", "None", 1, jenova);
		characterRepository.save(dragoon);
	}

	@Test
	public void canFindCharacterByBaseClass(){
		List<Character> found = characterRepository.findByBaseClass("Thaumaturge");
		assertEquals("Thaumaturge", found.get(0).getBaseClass());
	}

	@Test
	public void canFindCharacterByJob(){
		List<Character> found = characterRepository.findByJob("Bard");
		assertEquals("Bard", found.get(0).getJob());
	}

	@Test
	public void canFindCharacterByRole(){
		List<Character> found = characterRepository.findByRole("Healer");
		assertEquals("Healer", found.get(0).getRole());
	}

	@Test
	public void canFindCharacterByStartingLocation(){
		List<Character> found = characterRepository.findByStartingLocation("Limsa Lominsa");
		assertEquals("Limsa Lominsa", found.get(0).getStartingLocation());
	}

	@Test
	public void canFindCharacterByPrerequisites(){
		List<Character> found = characterRepository.findByPrerequisites("Level 50");
		assertEquals("Level 50", found.get(0).getPrerequisites());
	}

	@Test
	public void canFindCharacterByStartingLevel(){
		List<Character> found = characterRepository.findByStartingLevel(1);
		assertEquals(1, found.get(0).getStartingLevel());
	}


	@Test
	public void canFindServerByName(){
		List<Server> found = serverRepository.findByName("Titan");
		assertEquals("Titan", found.get(0).getName());
	}

	@Test
	public void canFindServerByWorld(){
		List<Server> found = serverRepository.findByWorld("Primal");
		assertEquals("Primal", found.get(0).getWorld());
	}

	@Test
	public void canFindByDataCenter(){
		List<Server> found = serverRepository.findByDataCenter("Europe");
		assertEquals("Europe", found.get(0).getDataCenter());
	}

	@Test
	public void canFindServersWithPopulationGreaterThan70000(){
		List<Server> found = serverRepository.findByPopulationGreaterThan(70000);
	}

}
