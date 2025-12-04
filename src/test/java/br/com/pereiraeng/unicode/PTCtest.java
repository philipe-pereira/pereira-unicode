package br.com.pereiraeng.unicode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PTCtest {

	@Test
	void testPTC() {
		String[] symbols = PTC.getPTC();
		assertEquals(symbols.length, 21);
	}

}
