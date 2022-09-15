package model;

import java.util.List;

public class PessoaJuridica extends Pessoa{
    private long cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(long cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String endereco, String telefone, long cep, double senha, int situacao, List<ContaComum> contas, long cnpj) {
        super(nome, endereco, telefone, cep, senha, situacao, contas);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String endereco, String telefone, long cep, double senha, int situacao, long cnpj) {
        super(nome, endereco, telefone, cep, senha, situacao);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj=" + cnpj +
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
