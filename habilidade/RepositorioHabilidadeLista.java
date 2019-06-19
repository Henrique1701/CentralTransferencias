package habilidade;

public class RepositorioHabilidadeLista implements RepositorioHabilidades {
	    private Habilidade habilidade;
	    private RepositorioHabilidadeLista proximo;

	    public RepositorioHabilidadeLista(){
	        this.habilidade = null;
	        this.proximo = null;
	    }

	    @Override
	    public void inserir(Habilidade habilidade) {
	        if(this.proximo == null){
	            this.habilidade.setPasse(habilidade.getPasse());
	            this.habilidade.setFinalizacao(habilidade.getFinalizacao());
	            this.habilidade.setInterceptacao(habilidade.getInterceptacao());
	            this.proximo = new RepositorioHabilidadeLista();
	        } 
	        else {
	            this.proximo.inserir(habilidade);
	        }
	    }

	    @Override
	    public void atualizar(Habilidade habilidade){
	        if(this.habilidade.getNomeJogador().equals(habilidade.getNomeJogador())){
	            this.habilidade.setPasse(habilidade.getPasse());
	            this.habilidade.setInterceptacao(habilidade.getInterceptacao());
	            this.habilidade.setFinalizacao(habilidade.getFinalizacao());

	        } else {
	            this.proximo.atualizar(habilidade);
	        }
	    }

	    @Override
	    public void remover(String nomeJogador){
	        if(this.habilidade.getNomeJogador().equals(nomeJogador)){
	            this.habilidade = this.proximo.habilidade;
	            this.proximo = this.proximo.proximo;
	        } else {
	            this.proximo.remover(nomeJogador);
	        }
	    }

	    @Override
	    public Habilidade procurar(String nomeJogador){
	        if(this.habilidade.getNomeJogador().equals(nomeJogador)){
	        	return this.habilidade;
	        } 
	        	else {
	            
	        	this.proximo.procurar(nomeJogador);
	        	}
	        	return null;
	    }

	    @Override
	    public boolean existe(String nomeJogador) {
	        if(this.habilidade != null){
	            if(this.habilidade.getNomeJogador().equals(habilidade.getNomeJogador())){
	                return true;
	            } else {
	                this.proximo.existe(nomeJogador);
	            }
	        }
	        return false;
	    }
	}
