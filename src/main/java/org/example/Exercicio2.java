package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Digite um número real (ou digite uma letra para sair): ");
                System.out.print("Digite seu número: ");
                if (!sc.hasNext()) {
                    break;
                }

                if (sc.hasNextDouble()) {
                    double num = sc.nextDouble();

                    if (num < 0) {
                        System.out.println("O número não pode ser negativo.");
                    } else {
                        if (num % 1 == 0) {
                            System.out.println("NÚMERO INTEIRO.");
                        } else {
                            System.out.println("NÚMERO DECIMAL.");
                        }
                    }
                } else {
                    System.out.println("Você digitou uma letra. Saindo do programa.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                sc.close();
            } finally {
                sc.nextLine();
            }

        } while (true);

        sc.close();
    }
}
