package br.com.pereiraeng.unicode;

import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * <strong>P</strong>honetic <strong>T</strong>ranscription
 * <strong>C</strong>haracters
 * 
 * @author Philipe PEREIRA
 *
 */
public class PTC {

	/**
	 * Função que retorna uma lista de caracteres para a transcrição fonética (
	 * <strong>P</strong>honetic <strong>T</strong>ranscription
	 * <strong>C</strong>haracters)
	 * 
	 * @return vetor de <code>String</code> cada um contendo um caracter diferente,
	 *         sendo alguns deles acentuados (possuindo assim mais de um
	 *         <code>char</code>.
	 */
	public static String[] getPTC() {
		String[] out = null;
		try {
			ObjectInputStream stream = new ObjectInputStream(PTC.class.getResourceAsStream("/tf"));
			out = (String[]) stream.readObject();
			stream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return out;
	}
}
