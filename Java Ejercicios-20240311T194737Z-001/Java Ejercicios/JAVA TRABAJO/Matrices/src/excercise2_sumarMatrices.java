import java.util.Scanner;

public class excercise2_sumarMatrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][], matriz2[][], matriz3[][];
        matriz1 = new int[3][3];
        matriz2 = new int[3][3];
        matriz3 = new int[3][3];

        //Matriz 1 de 3 x 3
        System.out.println("Matriz 1 de 3x3");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Ingresa valor, Matriz ["+i+"] ["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        //Matriz 2 de 3 x 3
        System.out.println("Matriz 2 de 3x3");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Ingresa valor, Matriz ["+i+"] ["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        //Suma de Matrices
        for (int i = 0; i < 3; i++) { //Recorre Filas
            for (int j = 0; j < 3; j++) { //Recorre Columnas
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Impresion de Matriz Sumada(3)
        System.out.println("Suma de las Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
