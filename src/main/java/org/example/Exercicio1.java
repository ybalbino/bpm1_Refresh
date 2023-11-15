package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite 3 numeros inteiros e vou te falar o menor numero deles: ");
            System.out.print("Digite primeiro número: ");
            int num1 = numeroPositivo(sc);
            System.out.print("Digite segundo número: ");
            int num2 = numeroPositivo(sc);
            System.out.print("Digite terceiro número: ");
            int num3 = numeroPositivo(sc);

            int numMenor = menorNum(num1, num2, num3);

            System.out.println("O menor numero é: " + numMenor);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira apenas números inteiros.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());

        }
        sc.close();
    }

    public static int numeroPositivo(Scanner sc) {
        int num;

        do {
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número valido");
                sc.next();
            }
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Por favor, insira um número positivo.");
            }

        } while (num < 0);
        return num;
    }

    public static int menorNum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

}
