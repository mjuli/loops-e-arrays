package br.com.dio.exercicios.loops;

// Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

import java.util.Scanner;

public class MaiorMedia {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int repetition = 1;
    float numero;
    float maior = 0;
    float soma = 0;

    do {
      System.out.println("Digite o " + repetition + "º numero: ");
      numero = scan.nextFloat();

      if(repetition == 1)
        maior = numero;
      else if(numero > maior)
        maior = numero;

      soma += numero;
      repetition++;

    } while (repetition < 6);

    System.out.println("O maior número digitado foi: " + maior);
    System.out.println("A media foi: " + (soma/5));
  }
}
