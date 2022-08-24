package controller;

import model.Associado;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    private static double auxiliar = 0.0;

    public static void main(String[] args) {
        // ---------- TÓPICO A ----------
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaPoupanca cp3 = new ContaPoupanca();
        ContaCorrente cr1 = new ContaCorrente(10, 100);
        ContaCorrente cr2 = new ContaCorrente(20, 200);
        ContaCorrente cr3 = new ContaCorrente(30, 300);
        Associado ass1 = new Associado("José Augusto", 100, 500);
        Associado ass2 = new Associado("Maria Helena", 400, 500);
        Associado ass3 = new Associado("Mario Henrique", 600, 500);

        System.out.println(cp1); System.out.println(cp2); System.out.println(cp3);
        System.out.println(cr1); System.out.println(cr2); System.out.println(cr3);
        System.out.println(ass1); System.out.println(ass2); System.out.println(ass3);
        System.out.println(); //Espaçamento

        // ---------- TÓPICO B ----------
        List<Conta> contas = new ArrayList<>();
        contas.add(cp1); contas.add(cp2); contas.add(cp3);
        contas.add(cr1); contas.add(cr2); contas.add(cr3);

        List<Associado> associados = new ArrayList<>();
        associados.add(ass1); associados.add(ass2); associados.add(ass3);

        System.out.println(contas); System.out.println(associados);
        System.out.println(); //Espaçamento

        // ---------- TÓPICO C ----------
        cp1.deposita(1000); System.out.println(cp1);
        cp1.atualiza(5); System.out.println(cp1);
        cp1.saca(50); System.out.println(cp1);
        System.out.println(); //Espaçamento

        // ---------- TÓPICO D ----------
        cr1.deposita(500); System.out.println(cr1);
        cr1.saca(400); System.out.println(cr1);
        System.out.println(); //Espaçamento

        // ---------- TÓPICO E ----------
        Associado ass4 = new Associado("Maria Antônia", 300, 500);
        Associado ass5 = new Associado("Julia Abreu", 600, 500);
        Associado ass6 = new Associado("Julio Cezar", 600, 500);
        associados.add(ass4); associados.add(ass5); associados.add(ass6);
        System.out.println(associados);
        System.out.println(); //Espaçamento

        // ---------- TÓPICO F ----------
        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed()); System.out.println(associados);
        System.out.println(); //Espaçamento
        associados.forEach(p -> {
            if(p.getQdeCotas() > auxiliar){
                auxiliar = p.getQdeCotas();
            }
        });

        associados.forEach(p -> {
            if(p.getQdeCotas() == auxiliar){
                System.out.println(p);
            }
        });
        System.out.println(); // Espaçamento

        // ---------- TÓPICO G ----------
        cp2.deposita(750); cp3.deposita(872.99);
        cr2.deposita(77); cr3.deposita(666.66);
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed()); System.out.println(contas);
        System.out.println(); //Espaçamento
        System.out.println(associados); //Espaçamento
        auxiliar = 0.0;
        contas.forEach(p -> {
            if(p.getSaldo() > auxiliar){
                auxiliar = p.getSaldo();
            }
        });

        contas.forEach(p -> {
            if(p.getSaldo() == auxiliar){
                System.out.println(p);
            }
        });
    }
}
