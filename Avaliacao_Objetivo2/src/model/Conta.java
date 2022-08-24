package model;

public abstract class Conta {
  protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
      if(valor > 0){
          this.saldo += valor;
      }
  }

  public void saca(double valor){
      if(valor <= this.saldo){
          this.saldo -= valor;
      }
  }

  public void atualiza(double taxa){
      if(taxa > 0){
          this.saldo += this.saldo * (taxa/100);
      }
  }
}
