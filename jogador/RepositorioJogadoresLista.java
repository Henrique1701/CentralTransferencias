package jogador;

public class RepositorioJogadoresLista implements RepositorioJogadores {
	private Jogador jogador;
	private RepositorioJogadoresLista proximo;

	public RepositorioJogadoresLista() {
		this.jogador = null;
	}

	public Jogador getJogadores() {
		return jogador;
	}

	public void setJogadores(Jogador jogadores) {
		this.jogador = jogadores;
	}
	public void inserir (Jogador jogador) {
		if (this.proximo == null) {
			this.jogador.setNome(jogador.getNome());
			this.jogador.setSalario(jogador.getSalario());
			this.jogador.setIdade(jogador.getIdade());
			this.jogador.setTempoDeContrato(jogador.getTempoDeContrato());
			this.jogador.setValor(jogador.getValor());
			this.jogador.setNota(jogador.getNota());
			this.proximo = new RepositorioJogadoresLista();
		} else {
			this.proximo.inserir(jogador);
		}
	}

	public void atualizar(Jogador jogador) {
		if (this.jogador.getNome().equals(jogador.getNome())) {
			this.jogador.setIdade(jogador.getIdade());
			this.jogador.setTempoDeContrato(jogador.getTempoDeContrato());
			this.jogador.setSalario(jogador.getSalario());
			this.jogador.setValor(jogador.getValor());
			this.jogador.setNota(jogador.getNota());
		} else {
			this.proximo.atualizar(jogador);
		}
	}

	public void remover(String nome) {
		if (this.jogador.getNome().equals(nome)) {
			this.jogador = this.proximo.jogador;
			this.proximo = this.proximo.proximo;
		} else {
			this.proximo.remover(nome);
		}
	}

	public Jogador procurar(String nome) {
		if (this.jogador.getNome().equals(nome)) {
			return this.jogador;
		} else {
			return this.proximo.procurar(nome);
		}
	}

	public boolean existe(String nome) {
		if (this.proximo == null) {
			if (this.jogador.getNome().equals(nome)) {
				return true;
			} else {
				return false;
			}
		}
		if (this.jogador.getNome().equals(nome)) {
			return true;
		} else {
			return this.proximo.existe(nome);
		}
	}

}