package jogador;

public interface RepositorioJogadores {
	public void inserir (Jogador jogador);
	
	public void atualizar (Jogador jogador)
		throws JogadorNaoEncontradoException;
	
	public void remover (String nome) 
		throws JogadorNaoEncontradoException;
	
	public Jogador procurar (String nome)
		throws JogadorNaoEncontradoException;
	
	public boolean existe (String nome);
}