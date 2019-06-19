package jogador;

public interface RepositorioJogadores {
	public void inserir (Jogador jogador);
	
	public void atualizar (Jogador jogador);
	
	public void remover (String nome);
	
	public Jogador procurar (String nome);
	
	public boolean existe (String nome);
}