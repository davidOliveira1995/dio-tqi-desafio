package me.dio.web;

import java.util.Scanner;

public class CompraLivraria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite na sequencia! Primeiro Livro");
        System.out.println("Nome do Livro, Preço, Quantidade");

        Livro livro1 = new Livro(scan.nextLine(), scan.nextDouble(), scan.nextInt());
        clearBuffer(scan);

        System.out.println("Digite na sequencia! Primeiro Livro");
        System.out.println("Nome do Livro, Preço, Quantidade");

        Livro livro2 = new Livro(scan.nextLine(), scan.nextDouble(), scan.nextInt());
        clearBuffer(scan);

        double valorTotal = (livro1.quantidade * livro1.preco) + (livro2.quantidade * livro2.preco);
        double livrosComprados = livro1.quantidade + livro2.quantidade;

        System.out.printf("Valor total da compra: %.2f", valorTotal);
        System.out.println();
        System.out.printf("Numero de livros comprados: %.0f", livrosComprados);
        System.out.println();
        System.out.println("Obrigado por comprar na nossa livraria!");
    }

    private static void clearBuffer(Scanner scan) {
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
