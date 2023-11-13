package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char result = sc.next().charAt(0);

        if (Character.isLowerCase(result)) {
            System.out.println("LETRA MINÚSCULA.");
        } else if (Character.isUpperCase(result)) {
            System.out.println("LETRA MAIÚSCULA.");
        } else if (Character.isDigit(result)) {
            System.out.println("DÍGITO NUMÉRICO.");
        } else {
            System.out.println("CARACTERE ESPECIAL.");
        }

        sc.close();
    }
}
