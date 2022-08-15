package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        //TÓPICO 1 -------------
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario(2, "André Luiz", 2550);
        System.out.println(func1);
        System.out.println(func2);

        System.out.println();
        func1.setId(1); func1.setNome("Ana Maria"); func1.setSalario(7800);
        System.out.println(func1.getId());
        System.out.println(func1.getNome());
        System.out.println(func1.getSalario());

        //TÓPICO 2 -------------
        System.out.println();
        Funcionario func3 = new Funcionario(3, "Wagner Moura", 18500);
        Funcionario func4 = new Funcionario(4, "Filipe Smith", 0);
        Funcionario func5 = new Funcionario(4, "Filipe Smith", 0);

        //Adicionando á Lista
        List<Funcionario> funcs = new ArrayList<>();
        funcs.add(func1); funcs.add(func2); funcs.add(func3);
        funcs.add(func4); funcs.add(func5);
        System.out.println(funcs);

        //Ordenando por ID
        funcs.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcs);

        //Pesquisando ID 3
        Funcionario encontrei = funcs.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(encontrei);

        //Tipo <Map>
        Map<Integer, Funcionario> funcs2 = new HashMap<>();
        funcs2.put(func1.getId(), func1);
        funcs2.put(func2.getId(), func2);
        funcs2.put(func3.getId(), func3);
        funcs2.put(func4.getId(), func4);
        funcs2.put(func5.getId(), func5);
        System.out.println(funcs2);
        System.out.println(funcs2.get(3));
    }
}
