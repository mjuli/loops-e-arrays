package br.com.dio.exercicios.arrays;

/*
* Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
*/

import java.util.Scanner;

public class OrdemInversa {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetor = new int[6];
    int count = 5;

    while (count >= 0) {
      System.out.println("Número: ");
      int numero = scan.nextInt();

      vetor[count] = numero;
      count--;
    }

    System.out.println("Vetor inverso: ");

    for (int num : vetor) {
      System.out.print(num + " ");
    }
  }
}
