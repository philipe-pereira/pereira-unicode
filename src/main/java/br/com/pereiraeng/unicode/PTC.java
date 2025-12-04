package br.com.pereiraeng.unicode;

import java.io.InputStream;

import br.com.pereiraeng.io.IOutils;

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
		InputStream stream = PTC.class.getResourceAsStream("/tf");
		return (String[]) IOutils.loadObjects(stream);
	}
}
