package br.com.dio.exercicios.loops;
/*
Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e
a quantidade de números impares.
*/

import java.util.Scanner;

public class ParImpar {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int pares = 0;
    int impares = 0;

    System.out.println("Digite o número de repetições: ");
    int repetition = scan.nextInt();

    do {
      System.out.println("Número: ");
      float numero = scan.nextFloat();

      if(numero % 2 == 0)
        pares++;
      else
        impares++;

      repetition--;
    } while (repetition > 0);

    System.out.println("Pares: " + pares);
    System.out.println("Impares: " + impares);
  }
}
