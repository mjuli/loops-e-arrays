package br.com.dio.exercicios.arrays;

/*
* Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso
* determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {

  public static void main(String[] args) {
    int[][] matriz = new int[4][4];
    int menor = 11;
    int posicaoLinha = 0;
    int posicaoColuna = 0;

    for (int linha = 0; linha < 4; linha++){
      for (int col = 0; col < 4; col++){
        int number = (int)(Math.random() * 10);
        matriz[linha][col] = number;

        if (number < menor) {
          menor = number;
          posicaoLinha = linha;
          posicaoColuna = col;
        }
      }
    }

    System.out.println("Array gerado:");

    for (int linha = 0; linha < 4; linha++){
      for (int col = 0; col < 4; col++){
        System.out.print(matriz[linha][col] + " ");
      }

      System.out.print("\n");
    }

    System.out.println("O menor valor é " + menor
            + ". Ele está na linha " + posicaoLinha
            + " e na coluna " + posicaoColuna);
    
  }
}
