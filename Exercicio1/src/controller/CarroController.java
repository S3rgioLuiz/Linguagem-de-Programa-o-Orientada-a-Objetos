package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        //TÓPICO 1 -------------
        Carro carro1 = new Carro();
        Carro carro2 = new Carro(2, "Ford", "Mustang", 2020);
        System.out.println(carro1);
        System.out.println(carro2);

        System.out.println();
        carro1.setId(1); carro1.setMarca("Volkswagen");
        carro1.setModelo("Gol"); carro1.setAnoFabricacao(2010);
        System.out.println(carro1.getId()); System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo()); System.out.println(carro1.getAnoFabricacao());

        //TÓPICO 2 -------------
        System.out.println();
        Carro carro3 = new Carro(3, "Volkswagen", "Polo", 2022);
        Carro carro4 = new Carro(4, "Honda", "Civic", 2015);
        Carro carro5 = new Carro(4, "Honda", "Civic", 2015);

        //Adicionando á Lista
        List<Carro> carros = new ArrayList<>();
        carros.add(carro1); carros.add(carro2); carros.add(carro3);
        carros.add(carro4); carros.add(carro5);
        System.out.println(carros);

        //Ordenando por ID
        carros.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carros);

        //Pesquisando ID 3
        Carro encontrei = carros.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(encontrei);

        //Tipo <Map>
        Map<Integer, Carro> carros2 = new HashMap<>();
        carros2.put(carro1.getId(), carro1);
        carros2.put(carro2.getId(), carro2);
        carros2.put(carro3.getId(), carro3);
        carros2.put(carro4.getId(), carro4);
        carros2.put(carro5.getId(), carro5);
        System.out.println(carros2);
        System.out.println(carros2.get(3));
    }
}
