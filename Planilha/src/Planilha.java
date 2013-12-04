public class Planilha {

	private Lista<Celula> planilha;
	private final char alinhaTabela = 'A';

	public Planilha(char ultPosicaoColuna, int tamanhoLinhas) {
		planilha = new Lista<Celula>();

	}

	public Celula getValor(char x, int y) {
		return planilha.get(getPosicao(x), y);
	}

	private Celula getValor(int x, int y) {
		return planilha.get(x, y);
	}

	public void setValor(char x, int y, String formula) {
		Celula cel = getValor(getPosicao(x), y);

		if (cel == null) {
			cel = new Celula();
			planilha.set(cel, getPosicao(x), y);
		}
		cel.setFormula(formula);
	}

	public int getPosicao(char x) {
		return Character.toUpperCase(x) - alinhaTabela;
	}
	
	
	
	
	
	
	
	
	
	

}
