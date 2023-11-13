package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros inteiros e vou te falar o menor numero deles: ");
        System.out.print("Digite primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite terceiro número: ");
        int num3 = sc.nextInt();

        int numMenor = menorNum (num1, num2, num3);

        System.out.println("O menor numero é: " + numMenor);

        sc.close();
    }

    public static int menorNum(int a, int b, int c){
        int menor = a;

        if (b < menor){
            menor = b;
        } else if (c < menor) {
            menor = c;
        }
        return menor;
    }
}
