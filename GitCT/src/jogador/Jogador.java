package jogador;

import pessoa.Pessoa;
// Sal�rio do jogador vai depender da nota e o do treinador da experi�ncia
public class Jogador extends Pessoa {
	private int tempoDeContrato;
	private double valor;
	private Pessoa pessoa;
	private double nota;

	public Jogador() {
		super ();
		this.tempoDeContrato = 0;
		this.valor = 0;
		this.setPessoa(null);
		this.nota = 0;
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
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
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
	private int finaliza��es;
	private int passes;
	private int intercepta��es;
	
	public Habilidades() {
		this.notaTotal = 0;
		this.finaliza��es = 0;
		this.passes = 0;
		this.intercepta��es = 0;
	}
	public int getNotaTotal() {
		return this.notaTotal;
	}
	public void setNotaTotal (int nota) {
		this.notaTotal = nota;
	}
	public int getFinaliza��es() {
		return this.finaliza��es;
	}
	public void setFinaliza��es (int finaliza��es) {
		this.finaliza��es = finaliza��es;
	}
	public int getPasses() {
		return this.passes;
	}
	public void setPasses (int passes) {
		this.passes = passes;
	}
	public int getIntercepta��es() {
		return this.intercepta��es;
	}
	public void setIntercepta��es (int intercepta��es) {
		this.intercepta��es = intercepta��es;
	}
}*/