package br.com.dio.exercicios.loops;

/*
* 🔸Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
* e continue pedindo até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Nota {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma nota entre 0 e 10: ");
    float nota = scan.nextFloat();

    while(nota < 0 || nota > 10){
      System.out.println("Nota inválida. Digite uma nota entre 0 e 10: ");
      nota = scan.nextFloat();
    }

    System.out.println("Nota: " + nota);
  }
}
