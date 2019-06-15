package fachada;
import treinador.*;
import jogador.*;
import time.*;

public class Fachada {
		private CadastroTimes cadastroTimes;
	    private CadastroTreinadores cadastroTreinadores;
	    private CadastroJogadores cadastroJogadores;
	    //private CadastroHabilidades habilidades;

	    public Fachada(RepositorioTimes repositorioTime, RepositorioTreinadores repositorioTreinadores, RepositorioJogadores repositorioJogadores){
	        this.cadastroTimes = new CadastroTimes(repositorioTime);
	        this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
	        this.cadastroJogadores = new CadastroJogadores(repositorioJogadores);
	        //this.cadastroTreinadores = new CadastroTreinadores(repositorioTreinadores);
	    }

	    //Malu (Time)
	    public void cadastrarTime (Time time) throws TimeJaCadastradoException {
	        cadastroTimes.cadastrar(time);
	    }
	    public void removerTime (String nome) throws TimeNaoEncontradoException {
	        cadastroTimes.remover(nome);
	    }
	    public  void atualizarTime (String nome, Time time) throws TimeNaoEncontradoException {
	        cadastroTimes.atualizar(nome, time);
	    }
	    public void procurarTime (String nome) throws TimeNaoEncontradoException {
	        cadastroTimes.procurar(nome);
	    }

	    //Henrique (Treinador)
	    public void cadastrarTreinador (Treinador treinador) throws TreinadorJaCadastradoException {
	        //Metodo exemplo, da aula 14
	        cadastroTreinadores.cadastrar(treinador);
	    }
	    public  void atualizarTreinador (Treinador treinador) throws TreinadorNaoEncontradoException {
	        cadastroTreinadores.atualizar(treinador);
	    }
	    public void removerTreinador (String registroFifa) throws TreinadorNaoEncontradoException {
	        cadastroTreinadores.remover(registroFifa);
	    }
	    public Treinador procurarTreinador (String registroFifa) throws TreinadorNaoEncontradoException {
	        return cadastroTreinadores.procurar(registroFifa);
	    }

	    //Igor (Jogador)
	    public void cadastrarJogador (Jogador jogador) throws JogadorJaCadastradoException, JogadorNaoEncontradoException {
	    	cadastroJogadores.cadastrar(jogador);
	    }
	    public void removerJogador (String nome) throws JogadorNaoEncontradoException {
	        cadastroJogadores.remover(nome);
	    }
	    public  void atualizarJogador (Jogador jogador) throws JogadorNaoEncontradoException {
	        cadastroJogadores.atualizar(jogador);
	    }
	    public Jogador procurarJogador (String nome) throws JogadorNaoEncontradoException {
	    	 return cadastroJogadores.procurar(nome);
	    }
	    /*
	    public void comprarJogador (Time time, Jogador jogador) throws VerbaInsuficienteException{
	        // double valorJogador = jogador.getValor();
	         * double verbaTime = time.getVerba();
	         * if (valorJogador < verbaTime){
	         * 		remover jogador do time de origem
	         * 		adicionar valor do jogador a verba do time de origem
	         * 		time.setVerba(verbaTime-valorJogador);
	         * } else {
	         * 		throws new VerbaInsuficienteException();
	         * }
	        //M�todo principal do projeto
	    }
	    public void atualizarInforma��es (){
	        //M�todo para atualizar idade, experi�ncia, sal�rio...
	    }
	    */

	    //TESTE
		public void atalizaIdade (){

		}


	}

