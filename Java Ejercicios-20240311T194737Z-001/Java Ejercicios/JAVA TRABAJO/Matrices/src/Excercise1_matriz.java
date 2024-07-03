import javax.swing.*;
import java.util.Scanner;

public class Excercise1_matriz {
    public static void main(String[] args) {
        /* Formula 1
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//{} = Fila, {n=Columna,n1=Columna, n2= Columna}

        for (int i=0;i<3;i++){ // For para número de filas
            for (int j=0; j<3;j++){ // For para número de Columnas
                System.out.print(matriz[i] [j]);
            }
            System.out.println("");
        }
         */
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas,nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de Filas:"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de Columnas:"));

        matriz = new int[nFilas][nCol];

        System.out.println("Digita la Matríz");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matrix es: ");
        for (int i=0;i<nFilas;i++){ // For para número de filas
            for (int j=0; j<nCol;j++){ // For para número de Columnas
                System.out.print(matriz[i] [j]);
            }
            System.out.println("");
        }

    }
}
