package com.ruff.m8ball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class M8BallTest {
	
	private static M8Ball m8bt;	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m8bt = new M8Ball();
		
	}

	@Test
	@Order(1)
	void M8BallTest_GivenNoParameters_ShouldConstructObject() {
		assertTrue(m8bt instanceof M8Ball);
		
	}
	@Test
	@Order(2)
	void askQuestion_GiveaString_ShouldReturnTrue() {
	boolean success = false;
	String question = (" Should I get a dog? ");
	
	success = m8bt.askQuestion(question);
	assertTrue(success);
	assertEquals(question, m8bt.getQuestion()); 

}

	
	@Test
	@Order(3)
	void shake_GivenNoParameters_ShouldReturnAnswer() {
		String answer = null;
		answer = m8bt.shake(); 
	//	assertEquals ("Ask again later." , answer);
		assertNotNull(answer);

	}
}

