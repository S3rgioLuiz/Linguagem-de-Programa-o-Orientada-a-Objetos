package model;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, double salario) {
        if(id >= 0){ this.id = id;}
        this.nome = nome;
        if(salario >= 0){this.salario = salario;}
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >= 0){ this.id = id;}
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){this.salario = salario;}
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
