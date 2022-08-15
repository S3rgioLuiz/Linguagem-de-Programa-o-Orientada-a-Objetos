package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {
        //TÓPICO 1 -------------
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2, 100);
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.setId(1);
        conta1.deposita(50);
        conta1.saca(27.90);
        conta1.atualiza(350.75);
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        //TÓPICO 2 -------------
        System.out.println();
        Conta conta3 = new Conta(3, 1050.75);
        Conta conta4 = new Conta(4, 0);
        Conta conta5 = new Conta(4, 0);

        //Adicionando á Lista
        List<Conta> contas = new ArrayList<>();
        contas.add(conta1); contas.add(conta2); contas.add(conta3);
        contas.add(conta4); contas.add(conta5);
        System.out.println(contas);

        //Ordenando por ID
        System.out.println();
        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas);

        //Pesquisando ID 3
        Conta encontrei = contas.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(encontrei);

        //Tipo <Map>
        Map<Integer, Conta> contas2 = new HashMap<>();
        contas2.put(conta1.getId(), conta1);
        contas2.put(conta2.getId(), conta2);
        contas2.put(conta3.getId(), conta3);
        contas2.put(conta4.getId(), conta4);
        contas2.put(conta5.getId(), conta5);
        System.out.println(contas2);
        System.out.println(contas2.get(3));
    }
}
