public class Lista<T> {

	private Nodo<T> primeiro;
	private Nodo<T> ultimo;

	public Lista() {
		primeiro = null;
		ultimo = primeiro;
	}

	public void set(T n, int linha, int coluna) {
		Nodo<T> nn = new Nodo<T>(linha, coluna);
		nn.setProximo(null);
		nn.setAnterior(ultimo);
		nn.setCelula(n);

		if (ultimo != null) {
			ultimo.setProximo(nn);
		}

		if (primeiro == null){
			primeiro = nn;
		}
		
		ultimo = nn;

	}

	public T get(int linha, int coluna) {
		Nodo<T> n = primeiro;
		while (n != null) {
			if (n.getLinha() == linha && n.getColuna() == coluna) {
				return n.getCelula();
			}
			n = n.getProximo();
		}
		return null;
	}

}
