package treinador;

import pessoa.Pessoa;

public class Treinador extends Pessoa {
    private String registroFifa;
    private double experiencia;

    public Treinador (String nome, int idade, double salario, String registroFifa, double experiencia){
        super(nome, idade, salario);
        this.registroFifa = registroFifa;
        this.experiencia = experiencia;
    }

    @Override
    public void calculaSalario() {
        super.setSalario(super.getSalario()*experiencia);
    }

    public String getRegistroFifa() {
        return registroFifa;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setRegistroFifa(String registroFifa) {
        this.registroFifa = registroFifa;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
}
