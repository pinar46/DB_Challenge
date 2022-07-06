package com.pinarc.DB_Challenge;

import com.pinarc.DB_Challenge.controller.BetriebsstelleController;
import com.pinarc.DB_Challenge.entities.Betriebsstelle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BetriebsstelleControllerTests {

	@Autowired
	BetriebsstelleController controller;

	@Test
	public void testGetBetriebsstelle() throws Exception {
		Betriebsstelle result1 = controller.queryBetriebsstelle("AAH"); //AAH;Aumühle;Aumühle;Bf;;DE 10369;0080;9;20111211;;685172;J;N;
		Betriebsstelle result2 = controller.queryBetriebsstelle("gibtEsNicht");

		assertAll(
				() -> assertNotNull(result1),
				() -> assertEquals("Aumühle", result1.getName()),
				() -> assertNull(result2)
		);

	}

}

