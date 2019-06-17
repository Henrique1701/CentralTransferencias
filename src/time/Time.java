package time;

import pessoa.Pessoa;
import jogador.RepositorioJogadores;
import treinador.RepositorioTreinadores;
import treinador.Treinador;

public class Time {
	private String nome;
	private double verbaTotal;
	private RepositorioJogadores jogadores;
	private RepositorioTreinadores treinador;
	
	public Time () {
		this.nome = null;
		this.verbaTotal = 0.00;
		this.jogadores = null;
		this.treinador = null;
	}

	//Pergunta a Malu, com a gente vai usar esse construtor
	/*
	public Time (String nome, double verba, RepositorioJogadores[] jogadores, Treinador treinador) {
		this.nome = nome;
		this.verbaTotal = verba;
		this.jogadores = jogadores;
		this.treinador = treinador;
	}
	*/
	
	public String getNome () {
		return nome;
	}
	
	public double getVerba () {
		return verbaTotal;
	}
	
	public RepositorioJogadores getJogadores () {
		return jogadores;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setVerba (double verbaAtual) {
		this.verbaTotal = verbaAtual;
	}

}
