package me.dio.web;

import java.util.Scanner;

public class MudancaIrlanda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Leitura do salário e dos benefícios
        double salarioBruto = scan.nextDouble();
        double beneficios = scan.nextDouble();

        double imposto = 0;


        if (salarioBruto <= 1100) {
            imposto = (salarioBruto / 100) * 5;
        } else if (salarioBruto > 1100 && salarioBruto <= 2500) {
            imposto = (salarioBruto / 100) * 10;
        } else {
            imposto = (salarioBruto / 100) * 15;
        }

        double salarioLiquido = (salarioBruto - imposto) + beneficios;
        //TODO: Implemente as regras para o cálculo do imposto.

        // Cálculo do salário líquido
        System.out.printf("%.2f", salarioLiquido);
    }
}
