package pessoa;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(){

    }

    public Pessoa (String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calculaSalario (); //Implementar classe abstrata
}