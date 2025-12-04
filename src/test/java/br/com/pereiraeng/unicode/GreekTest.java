package br.com.pereiraeng.unicode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GreekTest {

	@Test
	void testGreekLetterName() {
		char c = (char) 0x0391;
		String name = Greek.greek(c);
		assertEquals("Alpha", name);

		c = (char) 0x03A9;
		name = Greek.greek(c);
		assertEquals("Omega", name);

		c = (char) 0x03BC;
		name = Greek.greek(c);
		assertEquals("mu", name);
	}

	@Test
	void testGreekDetect() {
		assertTrue(Greek.isGreek((char) 0x0391));
		assertTrue(Greek.isGreek((char) 0x03B1));
		assertFalse(Greek.isGreek((char) 0x0050));
	}

}
