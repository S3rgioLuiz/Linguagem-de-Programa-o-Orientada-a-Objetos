package model;

import java.util.Date;
import java.util.List;

public class ContaEspecial extends ContaComum{
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo, List<Movimento> movimentos, List<Pessoa> pessoas, double limite) {
        super(numero, abeetura, fechamento, situacao, senha, saldo, movimentos, pessoas);
        this.limite = limite;
    }

    public ContaEspecial(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo, double limite) {
        super(numero, abeetura, fechamento, situacao, senha, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\nContaEspecial{" +
                "limite=" + limite +
                ", numero=" + numero +
                ", abeetura=" + abeetura +
                ", fechamento=" + fechamento +
                ", situacao=" + situacao +
                ", senha=" + senha +
                ", saldo=" + saldo +
                ", movimentos=" + getMovimentos() +
                ", pessoas=" + getPessoas() +
                '}';
    }
}
