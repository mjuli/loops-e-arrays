package br.com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

/*
* Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
public class Consoante {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int count = 6;
    int quantidadeConsoantes = 0;
    String[] consoantes = new String[6];
    String vogais = "aeiou";

    while (count > 0) {
      System.out.println("Digite uma letra: ");
      String letra = scan.next().toLowerCase();

      if (!vogais.contains(letra)) {
          consoantes[count] = letra;
          quantidadeConsoantes++;
      }

      count--;
    }

    System.out.println("Consoantes: ");

    for( String consoante : consoantes) {
      if(consoante != null)
        System.out.print(consoante + " ");
    }

    System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
  }
}
