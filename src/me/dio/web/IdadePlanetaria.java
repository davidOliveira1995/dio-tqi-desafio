package me.dio.web;

import java.util.Scanner;

public class IdadePlanetaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        double idadeTerrestre = scan.nextDouble();

        System.out.println("Didite o planeta: ");
        String planeta = scan.next();

        String mensagem = "";
        switch (planeta) {
            case "Marte":
                idadeTerrestre /= 1.88;
                break;
            case "Venus":
                idadeTerrestre /= 0.62;
                break;
            case "Jupiter":
                idadeTerrestre /= 11.86;
                break;
            default:
                mensagem = "Planeta invalido.";
        }
        if (planeta.equals("Marte") || planeta.equals("Venus") || planeta.equals("Jupiter")) {
            System.out.printf("Idade equivalente em " + planeta + ": %.2f anos", idadeTerrestre);
        } else {
            System.out.println(mensagem);
        }

        //TODO: Crie as condições para calcular a idade equivalente de cada planeta.

        //TODO: Imprima a saída conforme descrito neste desafio.

        scan.close();
    }
}
