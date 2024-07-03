/*
    Using two matrices of size 5x9 and 9x5, load the first one and transpose it into the second one.
 */

import java.util.Scanner;

public class Exercise6_dobleMatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matrizOriginal = new int[5][9];
        int[][] matrizTranspuesta = new int[9][5];

        // Llenar la matriz original con valores de ejemplo
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizOriginal[i][j] = i + j;
            }
        }

        // Transponer la matriz
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Imprimir la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matrizOriginal);

        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
