package model;

public class Associado implements AssociadoVip{
    private String nome;
    private int qdeCotas;
    private double valorCota;

    public Associado() {
    }

    public Associado(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        if(qdeCotas >= 0){this.qdeCotas = qdeCotas;}
        if(valorCota >= 0){this.valorCota = valorCota;}
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQdeCotas() {
        return qdeCotas;
    }

    public void setQdeCotas(int qdeCotas) {
        if(qdeCotas >= 0){this.qdeCotas = qdeCotas;}
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        if(valorCota >= 0){this.valorCota = valorCota;}
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public String toString() {
        return "\nAssociado{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCotas=" + valorCota +
                '}';
    }
}
