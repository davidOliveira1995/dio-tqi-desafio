package me.dio.web;
import java.util.Scanner;
public class TrafegoTransito {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.println("Digite uma opção.");
                System.out.println("1. Vermelho, 2. Amarelo, 3.Verde");
                int numero = scan.nextInt();

                switch(numero) {
                    case 1:
                        System.out.println("Pare! O sinal esta vermelho.");
                        break;
                    case 2:
                        System.out.println("Atencao! O sinal esta amarelo.");
                        break;
                    case 3:
                        System.out.println("Siga em frente! O sinal esta verde.");
                        break;
                    default:
                        System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
                }


                //TODO: Crie as condições necessárias para imprimir cada uma das possíveis saídas.
            }
        }

