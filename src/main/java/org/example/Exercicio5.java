package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite qual será o tamanho da sua lista: ");
            int tamanhoLista = sc.nextInt();

            List<Integer> numLista = new ArrayList<>();

            for (int i = 0; i < tamanhoLista; i++) {
                try {
                    System.out.print("Digite um número #" + (i + 1) +
                            ": ");
                    int num = sc.nextInt();
                    numLista.add(num);
                }catch (InputMismatchException e){
                    System.out.println("Por favor, digite um número válido. Tente novamente.");
                    sc.nextLine();
                    i--;
                }

            }

            double media = calcularMedia(numLista);

            System.out.println("A média aritmética é: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro para a quantidade de números.");
        }

        sc.close();
    }

    public static double calcularMedia(List<Integer> numeros){

        if (numeros == null || numeros.isEmpty()){
            return 0;
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.size();
    }
}


