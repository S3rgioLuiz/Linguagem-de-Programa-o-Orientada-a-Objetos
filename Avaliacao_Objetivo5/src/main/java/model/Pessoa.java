package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    protected String nome, endereco, telefone;
    protected long cep;
    protected double senha;
    protected int situacao = 1;
    private List<ContaComum> Contas = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, long cep, double senha, int situacao, List<ContaComum> contas) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.situacao = situacao;
        Contas = contas;
    }

    public Pessoa(String nome, String endereco, String telefone, long cep, double senha, int situacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(double senha) {
        this.senha = senha;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public List<ContaComum> getContas() {
        return Contas;
    }

    public void setContas(List<ContaComum> contas) {
        Contas = contas;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep=" + cep +
                ", senha=" + senha +
                ", situacao=" + situacao +
                ", Contas=" + Contas +
                '}';
    }
}
