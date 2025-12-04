package br.com.pereiraeng.unicode;

public class Greek {

	private static final String[] GREEK = { "alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta",
			"iota", "kappa", "lambda", "mu", "nu", "xi", "omicron", "pi", "rho", "sigma", "tau", "upsilon", "phi",
			"chi", "psi", "omega" };

	private static final int A_CAPITAL = 913, A_SMALL = 945, DOUBLE_SIGMA = 17, SIZE_P_1 = GREEK.length + 1;

	/**
	 * Função que converte um caracter unicode de uma letra grega em seu nome
	 * 
	 * @param c caracter unicode de uma letra grega
	 * @return nome da letra grega (a primeira letra da resposta será maiúscula se a
	 *         letra grega for maiúscula).<br>
	 * 
	 *         Exemplos:<br>
	 *         input: &#x0391; output: Alpha<br>
	 *         input: &#x03b1; output: alpha
	 */
	public static String greek(char c) {
		int i = c;
		boolean uppercase = i < A_SMALL;
		if (uppercase)
			i -= A_CAPITAL;
		else
			i -= A_SMALL;

		if (i >= DOUBLE_SIGMA)
			i--;

		String out = GREEK[i];
		if (uppercase)
			out = Character.toUpperCase(out.charAt(0)) + out.substring(1);
		return out;
	}

	/**
	 * Função que indica se um caracter unicode representa uma letra grega ou não
	 * 
	 * @param c caracter unicode
	 * @return <code>true</code> se for uma letra grega, <code>false</code> senão
	 */
	public static boolean isGreek(char c) {
		return (c >= A_CAPITAL && c < A_CAPITAL + SIZE_P_1) || (c >= A_SMALL && c < A_SMALL + SIZE_P_1);
	}
}
