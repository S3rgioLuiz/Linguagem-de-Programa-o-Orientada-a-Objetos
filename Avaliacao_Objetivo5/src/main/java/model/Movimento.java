package model;

import java.sql.Time;
import java.util.Date;

public class Movimento {
    private int tipo;
    private Date data;
    private Time hora;
    private double valor;
    private ContaComum conta;

    public Movimento() {
    }

    public Movimento(int tipo, Date data, Time hora, double valor, ContaComum conta) {
        if(valor > 0){
            this.tipo = tipo;
            this.data = data;
            this.hora = hora;
            this.valor = valor;
            this.conta = conta;
        }

    }

    public Movimento(int tipo, Date data, Time hora, double valor) {
        if(valor > 0) {
            this.tipo = tipo;
            this.data = data;
            this.hora = hora;
            this.valor = valor;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0){this.valor = valor;}
    }

    public ContaComum getConta() {
        return conta;
    }

    public void setConta(ContaComum conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "\nMovimento{" +
                "tipo=" + tipo +
                ", data=" + data +
                ", hora=" + hora +
                ", valor=" + valor +
                ", conta=" + conta +
                '}';
    }
}
