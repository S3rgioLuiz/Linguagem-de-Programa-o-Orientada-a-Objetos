package model;

public class Conta {
    private int id;
    private double saldo;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        if(id >= 0){this.id = id;}
        if(saldo >= 0){this.saldo = saldo;}
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposita(double valor){
        if(valor > 0){this.saldo += valor;}
        System.out.println("\nSaldo Atual: "+ this.saldo);
    }

    public void saca(double valor){
        if(valor >= 0 && valor < this.saldo){this.saldo -= valor;}
        System.out.println("\nSaldo Atual: "+ this.saldo);
    }

    public void atualiza(double taxa){
        if(taxa > 0){this.saldo += taxa * 0.01;}
        System.out.println("\nSaldo Atual: "+ this.saldo);
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
