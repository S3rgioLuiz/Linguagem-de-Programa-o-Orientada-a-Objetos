package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        //TÓPICO 1 -------------
        Produto produto1 = new Produto();
        Produto produto2 = new Produto(2, "Sabão", "Lavar Roupas", 18.99, 50);
        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println();
        produto1.setId(1); produto1.setNome("Lápis"); produto1.setDescricao("Colorir - 12 Unidades");
        produto1.setValor(12.99); produto1.setEstoque(50);
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        //TÓPICO 2 -------------
        System.out.println();
        Produto produto3 = new Produto(3, "Carregador", "p/ Celular", 18.9, 30);
        Produto produto4 = new Produto(4, "Luminária", "Temática - Harry Potter", 55.78, 25);
        Produto produto5 = new Produto(4, "Luminária", "Temática - Harry Potter", 55.78, 25);

        //Adicionando á Lista
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1); produtos.add(produto2); produtos.add(produto3);
        produtos.add(produto4); produtos.add(produto5);
        System.out.println(produtos);

        //Ordenando por ID
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos);

        //Pesquisando o ID 3
        Produto encontrei = produtos.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(encontrei);

        //Tipo <Map>
        System.out.println();
        Map<Integer, Produto> produtos2 = new HashMap<>();
        produtos2.put(produto1.getId(), produto1);
        produtos2.put(produto2.getId(), produto2);
        produtos2.put(produto3.getId(), produto3);
        produtos2.put(produto4.getId(), produto4);
        produtos2.put(produto5.getId(), produto5);
        System.out.println(produtos2);
        System.out.println(produtos2.get(3));
    }
}
