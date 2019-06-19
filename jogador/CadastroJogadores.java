package jogador;

public class CadastroJogadores {
	private RepositorioJogadores repositorioJogadores;
	
	public CadastroJogadores (RepositorioJogadores repositorio) {
		this.repositorioJogadores = repositorio;
	}
	public void cadastrar(Jogador jogador) throws JogadorJaCadastradoException{
		if (this.repositorioJogadores.existe(jogador.getNome()) == false) {
			this.repositorioJogadores.inserir(jogador);
		} else {
			throw new JogadorJaCadastradoException();
		}
	}
	public void remover(String nome) throws JogadorNaoEncontradoException {
		if (this.repositorioJogadores.existe(nome) == true) {
			this.repositorioJogadores.remover(nome);
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
	public void atualizar(Jogador jogador) throws JogadorNaoEncontradoException {
		if (this.repositorioJogadores.existe(jogador.getNome()) == true) {
			this.repositorioJogadores.atualizar(jogador);
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
	public Jogador procurar(String nome) throws JogadorNaoEncontradoException{
		if (this.repositorioJogadores.existe(nome) == true) {
			return this.repositorioJogadores.procurar(nome);
		} else {
			throw new JogadorNaoEncontradoException();
		}
	}
}
