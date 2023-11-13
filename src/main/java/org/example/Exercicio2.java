package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero e vou te dizer se é um numero inteiro ou decimal: ");

        System.out.print("Digite seu número: ");
        double num = sc.nextDouble();

        if (num % 1 == 0){
            System.out.println("NÚMERO INTEIRO.");
        } else {
            System.out.println("NÚMERO DECIMAL.");
        }
        sc.close();
    }
}
