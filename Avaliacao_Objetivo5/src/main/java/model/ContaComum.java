package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaComum {
    protected long numero;
    protected Date abeetura, fechamento;
    protected int situacao=1, senha;
    protected double saldo;
    private List<Movimento> movimentos = new ArrayList<>();

    private List<Pessoa> pessoas = new ArrayList<>();

    public ContaComum() {
    }

    public ContaComum(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo, List<Movimento> movimentos, List<Pessoa> pessoas) {
        this.numero = numero;
        this.abeetura = abeetura;
        this.fechamento = fechamento;
        this.situacao = situacao;
        this.senha = senha;
        this.saldo = saldo;
        this.movimentos = movimentos;
        this.pessoas = pessoas;
    }

    public ContaComum(long numero, Date abeetura, Date fechamento, int situacao, int senha, double saldo) {
        this.numero = numero;
        this.abeetura = abeetura;
        this.fechamento = fechamento;
        this.situacao = situacao;
        this.senha = senha;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getAbeetura() {
        return abeetura;
    }

    public void setAbeetura(Date abeetura) {
        this.abeetura = abeetura;
    }

    public Date getFechamento() {
        return fechamento;
    }

    public void setFechamento(Date fechamento) {
        this.fechamento = fechamento;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "\nContaComum{" +
                "numero=" + numero +
                ", abeetura=" + abeetura +
                ", fechamento=" + fechamento +
                ", situacao=" + situacao +
                ", senha=" + senha +
                ", saldo=" + saldo +
                ", movimentos=" + movimentos +
                ", pessoas=" + pessoas +
                '}';
    }
}
