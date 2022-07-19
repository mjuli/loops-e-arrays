package br.com.dio.exercicios.loops;

/*
* Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
* */

import java.util.Scanner;

public class Fatorial {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = scan.nextInt();
    int fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }

    System.out.println("O fatorial de " + numero + " é " + fatorial);
  }
}
