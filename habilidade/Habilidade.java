package habilidade;

import jogador.Jogador;

public class Habilidade {
	
	private String nomeJogador;
	private double notaTotal;
	private int finalizacao;
	private int passe;
	private int interceptacao;
	
	public Habilidade (int finalizacao, int passe, int interceptacao) {
		this.nomeJogador = "";
		this.notaTotal = 0;	
	}
	
	public String getNomeJogador() {
		return this.nomeJogador;
	}
	
	public int getFinalizacao() {
		return this.finalizacao;
	}

	public void setFinalizacao(int finalizacao) {
		this.finalizacao=finalizacao;
	}

	public int getInterceptacao() {
		return this.interceptacao;
	}

	public void setInterceptacao (int interceptacao) {
		this.interceptacao = interceptacao;
	}
	
	public int getPasse() {
		return this.passe;
	}
	
	public void setPasse(int passe) {
		this.passe = passe;
	}	
	
		public double getNotaTotal() {
			this.finalizacao = 0;
			this.passe = 0;
			this.interceptacao = 0;

			this.notaTotal=((this.interceptacao + this.passe+ this.finalizacao)/3);
				return this.notaTotal;

		}	
	
}
