package model;

import java.util.List;

public class PessoaFisica extends Pessoa{
    private long cpf, rg;
    private int idade;

    public PessoaFisica() {
    }

    public PessoaFisica(long cpf, long rg, int idade) {
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public PessoaFisica(String nome, String endereco, String telefone, long cep, double senha, int situacao, List<ContaComum> contas, long cpf, long rg, int idade) {
        super(nome, endereco, telefone, cep, senha, situacao, contas);
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public PessoaFisica(String nome, String endereco, String telefone, long cep, double senha, int situacao, long cpf, long rg, int idade) {
        super(nome, endereco, telefone, cep, senha, situacao);
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nPessoaFisica{" +
                "cpf=" + cpf +
                ", rg=" + rg +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep=" + cep +
                ", senha=" + senha +
                ", situacao=" + situacao +
                ", contas=" + getContas() +
                '}';
    }
}
