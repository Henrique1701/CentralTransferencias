package habilidade;
import habilidade.Habilidade;
public class CadastroHabilidades {


	    private RepositorioHabilidades repositorioHabilidades;

	    public CadastroHabilidades(RepositorioHabilidades repositorio){
	        repositorioHabilidades= repositorio;
	    }

	    public void cadastrar (Habilidade habilidade) throws HabilidadesJaCadastradoException{
	        if(this.repositorioHabilidades.existe(habilidade.getNomeJogador()) == false){
	            this.repositorioHabilidades.inserir(habilidade);
	        } else {
	            throw new HabilidadesJaCadastradoException();
	        }
	    }

	    public void atualizar (Habilidade habilidade) throws HabilidadeNaoEncontradaException, HabilidadesJaCadastradoException {
	    	 if(this.repositorioHabilidades.existe(habilidade.getNomeJogador()) == false){
		            this.repositorioHabilidades.atualizar(habilidade);
		        } else {
		            throw new HabilidadesJaCadastradoException();
		        }
	    }

	    public void remover (String nomeJogador) throws HabilidadeNaoEncontradaException, HabilidadesJaCadastradoException {
	    	 if(this.repositorioHabilidades.existe(habilidade.getNomeJogador()) == true){
		            this.repositorioHabilidades.remover(habilidade);
	        } else {
	            throw new  HabilidadesJaCadastradoException();
	            
	       
	        }
	    }

	    public Habilidade procurar (String nomeJogador) throws HabilidadeNaoEncontradaException {
	        if(this.repositorioHabilidades.existe(Habilidade.getNomeJogador()) == true){
	            return this.repositorioHabilidades.procurar(nomeJogador);
	        } else {
	            throw new HabilidadeNaoEncontradaException();
	        }
	    }
	
	
	
}
