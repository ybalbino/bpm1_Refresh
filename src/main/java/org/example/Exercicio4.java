package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Digite a idade da pessoa:");
                idade = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor numérico para a idade.");
                sc.next();
            }
        }

        String categoria = classificarIdade(idade);

        System.out.println("A pessoa pertence à categoria: " + categoria);

        sc.close();
    }

    public static String classificarIdade(int idade) {
        if (idade >= 0 && idade <= 12) {
            return "A. Criança";
        } else if (idade >= 13 && idade <= 17) {
            return "B. Adolescente";
        } else if (idade >= 18 && idade <= 59) {
            return "C. Adulto";
        } else if (idade >= 60) {
            return "D. Idoso";
        } else {
            return "E. Categoria inválida";
        }
    }
}

