package me.dio.web;

import java.util.Scanner;

public class LojaGeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double media = scan.nextDouble();
        String avaliacao = "";
        if (media < 5) {
            avaliacao = "REP";
        } else if (media > 5 && media < 7) {
            avaliacao = "MED";
        } else {
            avaliacao = "APR";
        }

        System.out.println(avaliacao);

    }
}
