package br.com.pereiraeng.unicode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PTCtest {

	@Test
	public void testPTC() {
		String[] symbols = PTC.getPTC();
		assertEquals(symbols.length, 21);
	}
}
