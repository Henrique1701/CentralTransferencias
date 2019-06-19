package jogador;

public class RepositorioJogadoresArray implements RepositorioJogadores{
	private Jogador [] jogador = new Jogador [100];
	private int indice = 0;

	public RepositorioJogadoresArray (int tamanho) {
		this.jogador = new Jogador[tamanho];
		indice = 0;
	}

	public Jogador [] getJogadores() {
		return jogador;
	}

	public void setJogadores(Jogador [] jogador) {
		this.jogador = jogador;
	}

	public void inserir (Jogador jogador) {
		if (indice < this.jogador.length) {
			this.jogador [this.indice] = jogador;
			indice++;
		} else {
			Jogador [] aux = new Jogador [(this.jogador.length + 1)*2];
			for (int c = 0; c < this.jogador.length; c++) {
				aux [c] = this.jogador [c];
			}
			this.jogador = aux;
			this.jogador [this.indice] = jogador;
			indice++;
		}
	}

	public void atualizar(Jogador jogador) {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(jogador.getNome())) {
				this.jogador[c].setNome(jogador.getNome());
				this.jogador[c].setIdade(jogador.getIdade());
				this.jogador[c].setSalario(jogador.getSalario());
				this.jogador[c].setTempoDeContrato(jogador.getTempoDeContrato());
				this.jogador[c].setValor(jogador.getValor());
				this.jogador[c].setNota(jogador.getNota());
			}
		}
	}

	public void remover(String nome) {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				indice--;
				this.jogador[c] = this.jogador[indice];
			}
		}
	}

	public Jogador procurar(String nome) {
		for (int c = 0; c < this.jogador.length; c++) {
			if (this.jogador[c].getNome().equals(nome)) {
				return this.jogador[c];
			} 
		}
		return this.jogador[indice];
	}

	public boolean existe(String nome) {
		int indiceAux = getIndice();
		if (indiceAux != 0) {
			for (int c = 0; c < indiceAux; c++) {
				if (jogador[c].getNome().equals(nome)) {
					return true;
				} 
			}
		}
		return false;
	}

	private int getIndice() {
		return indice;
	}

}
