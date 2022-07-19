package br.com.dio.exercicios.arrays;

/*
* Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
* Ao final, mostre os números e seus sucessores.
*/

public class NumerosAleatorios {

  public static void main(String[] args) {
    int[] numerosAleatorios = new int[20];
    int[] sucessores = new int[20];

    for(int i = 0; i < 20; i++){
      int randomNumber = (int)(Math.random() * 101);

      numerosAleatorios[i] = randomNumber;
      sucessores[i] = ++randomNumber;
    }

    System.out.println("Números aleatórios: ");

    for(int numeroAleatorio : numerosAleatorios){
      System.out.print(numeroAleatorio + " ");
    }

    System.out.println("\nNúmeros sucessores: ");

    for(int sucessor : sucessores){
      System.out.print(sucessor + " ");
    }
  }
}
