package jogador;

import pessoa.Pessoa;
// Salário do jogador vai depender da nota e o do treinador da experiência
public class Jogador extends Pessoa {
	private int tempoDeContrato;
	private double valor;
	private double nota;

	public Jogador(String nome, int idade, double salario, int tempoDeContrato, double valor, double nota) {
		super (nome, idade, salario);
		this.tempoDeContrato = tempoDeContrato;
		this.valor = valor;
		this.nota = nota;
	}
	public int getTempoDeContrato() {
		return this.tempoDeContrato;
	}
	public void setTempoDeContrato (int contrato) {
		this.tempoDeContrato = contrato;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
/*	public Habilidades getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidades habilidades) {
		this.habilidades = habilidades;
	}*/
/*	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}*/
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void calculaSalario() {
		super.setSalario(super.getSalario() + nota*10);  
	}

}
/*
class Habilidades extends Jogador {
	private int notaTotal;
	private int finalizaÃ§Ãµes;
	private int passes;
	private int interceptaÃ§Ãµes;
	
	public Habilidades() {
		this.notaTotal = 0;
		this.finalizaÃ§Ãµes = 0;
		this.passes = 0;
		this.interceptaÃ§Ãµes = 0;
	}
	public int getNotaTotal() {
		return this.notaTotal;
	}
	public void setNotaTotal (int nota) {
		this.notaTotal = nota;
	}
	public int getFinalizaÃ§Ãµes() {
		return this.finalizaÃ§Ãµes;
	}
	public void setFinalizaÃ§Ãµes (int finalizaÃ§Ãµes) {
		this.finalizaÃ§Ãµes = finalizaÃ§Ãµes;
	}
	public int getPasses() {
		return this.passes;
	}
	public void setPasses (int passes) {
		this.passes = passes;
	}
	public int getInterceptaÃ§Ãµes() {
		return this.interceptaÃ§Ãµes;
	}
	public void setInterceptaÃ§Ãµes (int interceptaÃ§Ãµes) {
		this.interceptaÃ§Ãµes = interceptaÃ§Ãµes;
	}
}*/
