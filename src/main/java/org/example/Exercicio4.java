package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {

    public static String classificacaoIdade(int idade){
        if (idade <= 12){
            return "A - Criança";
        } else if (idade >= 13 && idade <= 17) {
            return "B - Adolescente";
        } else if (idade >= 18 && idade <= 59) {
            return "C - Adulto";
        } else if (idade >= 60) {
            return "D - Idoso";
        } else {
            return "E - Categoria inválida";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade e vamos te falar em qual categoria" +
                "essa idade se classifica");

        try {
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            String cat = classificacaoIdade(idade);

            if (cat.equals("4")){
                System.out.println("Categoria inválida. A idade fornecida não se enquadra em nenhuma categoria.");
            }else {
                System.out.println("A pessoa pertence à categoria: " + cat);
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um valor inteiro para a idade.");
        }

        sc.close();
    }
}

