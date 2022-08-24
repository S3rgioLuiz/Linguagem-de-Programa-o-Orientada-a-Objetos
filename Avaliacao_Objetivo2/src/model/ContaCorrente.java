package model;

public class ContaCorrente extends Conta implements AssociadoVip{
   private int qdeCotas;
   private double valorCota;

    public ContaCorrente() {
    }

    public ContaCorrente(int qdeCotas, double valorCota) {
        if(qdeCotas >= 0){this.qdeCotas = qdeCotas;}
        if(valorCota >= 0){this.valorCota = valorCota;}
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
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                '}';
    }
}
