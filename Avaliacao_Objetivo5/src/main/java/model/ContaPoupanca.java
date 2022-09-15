package model;

import java.util.Date;
import java.util.List;

public class ContaPoupanca extends ContaComum{
    private Date aniversario;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Date aniversario) {
        this.aniversario = aniversario;
    }

    public ContaPoupanca(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo, List<Movimento> movimentos, List<Pessoa> pessoas, Date aniversario) {
        super(numero, abeetura, fechamento, situacao, senha, saldo, movimentos, pessoas);
        this.aniversario = aniversario;
    }

    public ContaPoupanca(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo, Date aniversario) {
        super(numero, abeetura, fechamento, situacao, senha, saldo);
        this.aniversario = aniversario;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "aniversario=" + aniversario +
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
